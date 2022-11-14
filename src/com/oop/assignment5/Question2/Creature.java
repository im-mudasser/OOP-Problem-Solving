package com.oop.assignment5.Question2;

public class Creature {
	// instance variable
	protected String name;
	protected int level;
	protected int healthStatus;
	protected int force;
	protected int position;

	// constructor

	/*
	 * a constructor allowing the initialization of the name, level, health points,
	 * force and position of the creature using the values passed as parameters, in
	 * this order; the constructor accepts zero as default value for the position;
	 */
	public Creature() {
		position = 0;
	}

	public Creature(String name, int level, int healthStatus, int force, int position) {
		this.name = name;
		this.level = level;
		this.healthStatus = healthStatus;
		this.force = force;
		this.position = position;
	}

	// methods

	/*
	 * a method bool alive() returning true if the creature is alive (number of
	 * health points greater than zero) or false otherwise;
	 */
	public boolean alive() {
		return healthStatus > 0;
	}

	/*
	 * a method AttackPoints returning the number of attack points that can be
	 * inicted by the creature to others; the value is computed as the level
	 * multiplied by the force if the creature is alive, or zero otherwise;
	 */

	public int attackPoints() {
		int attackPoints = 0;
		if (alive()) {
			attackPoints = level * force;
		}
		return attackPoints;
	}

	/*
	 * a method Move(int), which does not return anything and adds the integer
	 * passed as parameter to the position of the creature;
	 */
	public void move(int position) {
		System.out.println(name + "move" + position);
		this.position += position;
	}

	/*
	 * a method GoodBye() which does not return anything and displays the message
	 * (English: <name> is no more!): using strictly this format. <name> is the name
	 * of the creature
	 */
	public void goodBye() {
		System.out.println(this.name + "is no more");
	}
	/*
	 * a method Weak, which does not return anything and substracts the number of
	 * points passed as parameter from the number of health points of the creature,
	 * if it is alive; if the creature dies, its number of health points is set to
	 * zero and the method GoodBye is called;
	 */

	public void weak(int numberOfpoints) {
		this.healthStatus -= numberOfpoints;
		if (!alive()) {
			// System.out.println(this.name);
			this.healthStatus = 0;
			this.goodBye();
		}
//		if (alive()) {
//			this.healthStatus -= numberOfpoints;
//			System.out.println(this.healthStatus + this.name);
//		} else {
//			this.healthStatus = 0;
//			goodBye();
//		}

	}

	// display
	public void display() {
		System.out.println(name + "," + "level:" + level + ",healthStatus:" + healthStatus + "," + "force:" + force
				+ "," + "AttackingPoints:" + attackPoints() + "," + "Position:" + position);
	}

}
