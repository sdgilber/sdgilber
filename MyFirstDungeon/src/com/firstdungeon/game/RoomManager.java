package com.firstdungeon.game;

import com.firstdungeon.fixtures.*;

public class RoomManager
{

	Room startingRoom;
	Room[] rooms = new Room[7];
	// All rooms in the house.

	public void init()
	// Instantiates room objects, links the exits and
	// designates the starting room.
	{
		Room foyer = new Room ("The Foyer", "A small foyer",
			("The small entryway of a neo-colonial house. "
			+ "A dining room is open to the south, "
			+ "where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, "
			+ "next to a staircase "
			+ "that leads up to a second floor." + "\n"
			+ "To the north is a small room, "
			+ "where you can see a piano."));
		this.rooms[0] = foyer;

	    Room music = new Room("The Music Room", "A music room",
	    		("A room full of musical instruments. "+
	    		"In addition to the grand piano, there are a "+
	    		 "tuba, saxophone, guitar and very old violin. "
	    		 + "To the west is a small door. "));
	    this.rooms[1] = music;
	    
	    Room porch = new Room("The Porch", "Out on the porch",
	    		("You are outside of the colonial house. "+
	    		"There are undead zombies milling the streets. "+
	    		 "Go back inside and lock the door. "));
	    this.rooms[2] = porch;
	    
	    Room dining = new Room("The Dining Room", "A dining room",
	    		("The table seats ten people.  A centerpiece of "+
	    		"glazed watermelon adorns the center of the table. "+
	    		 "Plates, bowls and utensils are set.  The only way "+
	    		"back is north to the foyer. "));
	    this.rooms[3] = dining;
	    
	    Room doorway = new Room("The Doorway", "An inner doorway",
	    		("This doorway leads to a stairwell leading upstairs. "+
	    		"The staircase is old and potentially unstable. "+
	    		 "It has not been maintained for a long time. "+
	    		"Up is the attic and east back to the foyer. "));
	    this.rooms[4] = doorway;
	   
	    Room attic = new Room("Attic", "A dark attic",
	    		("The choking dust bunnies and thick cobwebs are horrific. "+
	    		"Rats, squirrels, mice and bats scurry around freely. "+
	    		 "A steel box lies ominously in a corner."+
		    		"The only way out is back down. "));
	    this.rooms[5] = attic;
	   
	    Room closet = new Room ("Closet", "The closet",
	    		("A dark closet with a horrid smell. "+
	    		"There are clothes hanging here that were in "+
	    		"fashion about 100 years ago.  One suit is still "+
	    		"being worn.  You find the source of the smell. "+
	    		"There is a skeleton in the closet, fully dressed. "));
	    this.rooms[6] = closet;
	   
	    this.startingRoom = foyer;
	    /*Exits = [north, northeast, east, southeast, south, southwest, west, northwest, up, down]*/
	    foyer.setExits(new Room[] {music, null, porch, null, dining, null, doorway, null, null, null});
	    music.setExits(new Room[] {null, null, null, null, foyer, null, closet, null, null, null});
	    porch.setExits(new Room[] {null, null, null, null, null, null, foyer, null, null, null});
	    dining.setExits(new Room[] {foyer, null, null, null, null, null, null, null, null, null});
	    doorway.setExits(new Room[] {null, null, foyer, null, null, null, null, null, attic, null});
	    attic.setExits(new Room[] {null, null, null, null, null, null, null, null, null, doorway});
	    closet.setExits(new Room[] {null, null, music, null, null, null, null, null, null, null});
	}

}
