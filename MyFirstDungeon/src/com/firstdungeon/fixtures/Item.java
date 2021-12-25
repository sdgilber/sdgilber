package com.firstdungeon.fixtures;

public class Item extends Fixture

{
	public boolean pickable; // Can this item be picked
	// up and added to inventory?

	void pickUp(String name)
	{
		if (this.pickable == true)
		{
			System.out.println("You picked up a " + name + ".");
		}
		else
		{
			System.out.println("You can't carry this.");
		}
	}
}
