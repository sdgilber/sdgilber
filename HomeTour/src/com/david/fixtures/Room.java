package com.david.fixtures;

public class Room extends Fixture
{
	/* maximum number of exits is 10, 
	corresponding to [N, NE, E, SE, S, SW, W, NW, UP, DOWN],
	in the largest possible room.
	
	Most rooms are much smaller, with only N, E, S, W, 
	maybe a staircase going up or down.  Directions for which 
	there is no exit are null.
	
	For example, the entrance has a north exit going to 
	the music room, an east exit leaving the house,
	a south exit to the dining room and a west exit
	to a doorway with an exit up.  NE, NW, SE, SW, UP and 
	DOWN are null.*/
	
	public Room [] exits = new Room[10];
	
	/*The array of rooms adjacent to the current room.*/
	
	// Getters for each exit.
	
	public Room (String name)
	{
		this.name = name;
	}
	

	public Room(String name, String shortDescription, String longDescription) 
	{
		super(name, shortDescription, longDescription);
	}

	public Room[] getExits() 
	{
		
		return exits;
	}
		
	public Room getExit(String direction) 
	{
		// If there is an exit in the given direction,
		// return that room; else return null.
		switch(direction)
		{
			case "n":
			case "north":
			{
				return exits[0];
			}
			case "ne":
			case "northeast":
			{
				return exits[1];
			}
			case "e":
			case "east":
			{
				return exits[2];
			}
			case "se":
			case "southeast":
			{
				return exits[3];
			}
			case "s":
			case "south":
			{
				return exits[4];
			}
			case "sw":
			case "southwest":
			{
				return exits[5];
			}
			case "w":
			case "west":
			{
				return exits[6];
			}
			case "nw":
			case "northwest":
			{
				return exits[7];
			}
			case "u":
			case "up":
			{
				return exits[8];
			}
			case "d":
			case "down":
			{
				return exits[9];
			}
			default:
			{
				System.out.println("Where are you trying to go? ");
				return null;
			}
		}	
	}

	public void setExits (Room[] exits)
	{
		// This reads from the arrays declared in 
		// Room Manager for exits from each room.
		// More efficient than a method for each direction!
		for (int i = 0; i < exits.length; i++)
		{
			this.exits[i] = exits[i];
		}
	}
	
	
		
}