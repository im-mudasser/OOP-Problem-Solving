package com.oop.assignment5.Question2;

public class Dragon extends Creature {
	protected int flameRange;

	private final int MAX_DISTANCE = 3;

	// constructor
	public Dragon(String name, int level, int numberOfHealthPoints, int force, int position, int flameRange) {
		super(name, level, numberOfHealthPoints, force, position);
		this.flameRange = flameRange;
	}

	// method
	public void fly(int position) {
		// System.out.println(this.name + "move by" + position);
		super.move(position);
	}

	public void blowFlame(Hydra hydra) {
		int distance = Math.abs(super.position - hydra.position);
		// System.out.println("***********distance from class dragon" + distance);
		if (super.alive() && hydra.alive()) {
			if (distance <= MAX_DISTANCE) {
				// dragon attach
				int attack = super.attackPoints();
				hydra.weak(attack);
				super.weak(distance);
				if (this.alive()) {
					if (!hydra.alive()) { // not alive
						this.level += 1;
					}

				}
			} else {
				System.out.println(this.name + "not in range");
			}

		}
	}
}
