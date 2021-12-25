package com.david.game;

import java.util.Scanner;
import com.david.fixtures.*;

public class Main 
{
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// Game loop goes here.
		
		
		Player player = new Player();
		RoomManager rm = new RoomManager();
		rm.init();
		player.currentRoom = rm.startingRoom;
		printRoom(player);
		parse(collectInput(), player);
		scanner.close();
	}
		
	private static void printRoom(Player player) 
	{
		// Prompts console for current room.
		System.out.println(player.currentRoom.longDescription);
	}

	private static String[] collectInput() 
	{
		/* Splits console input into command, object,
		such as look table or go north.*/
		
		String action = ""; // Go, look, quit, etc.
		String target = ""; // Direction, items, etc.
		System.out.println("Command? (go, look, quit)");
		action = scanner.nextLine();
		System.out.println("Which way?"); 
		/*logically, which direction to go, but also what to
		  look at or the way to pick up a desired item etc.*/
		target = scanner.nextLine();
		
		return new String[] {action, target};
		
		
		
	}
		
	private static void parse(String[] command, Player player) 
	{
		String target = command[1]; // Direction, object, etc.
		switch(command[0]) // Actions.
		{
			case "go": // Goes somewhere.
			{
				Room nextRoom = player.currentRoom.getExit(target);
				if (nextRoom != null)
				{
					player.currentRoom = nextRoom;
					printRoom(player);
					parse(collectInput(), player);
				}
				else
				{
					System.out.println("You bump into a wall.");
				}
				parse(collectInput(), player);
				break;
			}
			case "look": // Looks at fixtures.
			{
				player.currentRoom.look(target);
				parse(collectInput(), player);
				break;
			}
			case "quit": // Quits the game.
			{
				System.out.println("I QUIT!");
				System.exit(0);  // Breaks the game loop.
			}	
			default:  // Anything the program doesn't understand.
			{
				System.out.println("I don't understand./n");
				break;
			}
		}
	}
}
