package com.firstdungeon.game;

import com.firstdungeon.fixtures.*;

public class Player
{
	Room currentRoom; // Where are you?
	Item[] inventory; // What items do I have?
	// Basic RPG character info.
	String name = "Mad Maximus";
	String characterClass = "Warrior";
	String weapon = "Broad Sword";
	String armor = "Chain Mail";
	int level = 1;
	int HP = 100;
	int maxHP = 100;
	int MP = 50;
	int maxMP = 50;
	int attack = 10;
	int defense = 10;
	int magicAttack = 10;
	int magicDefense = 10;
}
