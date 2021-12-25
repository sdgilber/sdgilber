package com.firstdungeon.fixtures;

public class Door extends Fixture
{
	public boolean closed; // Is it open or will
	//we be walking into doors?
	public boolean locked; // Some doors have to be unlocked
	//before they can be opened.

	public void open(Door door)
	{
		if (door.locked == false)
		{
			if (door.closed == true)
			{
				System.out.println("You opened the door.");
				door.closed = false;
			}
			else
			{
				System.out.println("This door is already open.");
			}
		}
		else
		{
			System.out.println("The door is locked.");
		}
	}
	
	public void shut(Door door)
	{
		
		if (door.closed == false)
		{
			System.out.println("You closed the door.");
			door.closed = true;
		}
		else
		{
			System.out.println("The door is already closed.");
		}
		
	}
	public void lock (Door door)
	{
		if (door.locked == false)
		{
			System.out.println("You locked the door.");
			door.locked = true;
		}
		else
		{
			System.out.println("The door is already locked.");
		}
	}
	
	public void unlock (Door door)
	{
		if (door.locked == true)
		{
			System.out.println("You unlocked the door.");
			door.locked = false;
		}
		else
		{
			System.out.println("The door is not locked.");
		}
	}
}
