package com.firstdungeon.fixtures;

public abstract class Fixture 
{
	public String name; // This is an object,
	public String shortDescription; // This is a 
	//sentence describing an object.
	public String longDescription; // This is a 
	//paragraph describing an object.  It
	//goes into great detail, more than
	//a sentence or two.  It is long.
	
	
	public Fixture()
	{
		//Default constructor like what the compiler would make.
	}
	
	public Fixture(String name, String shortDescription, String longDescription) 
	{
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() 
	{
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) 
	{
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() 
	{
		return longDescription;
	}

	public void setLongDescription(String longDescription) 
	{
		this.longDescription = longDescription;
	}

	public void look(String name) // Looking at something.
	{
		if (name != null) // Verifies it's there.  If so...
		{
			System.out.println(longDescription);
		}
		else // If it isn't there...
		{
			System.out.println("There is no "+ name + " here.\n");
		}
	}

}	