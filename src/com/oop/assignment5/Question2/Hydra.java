package com.oop.assignment5.Question2;

public class Hydra extends Creature {
	protected int neckLength;
	protected int poisonDose;
	Dragon dragon;
	private final int MAX_DISTANCE = 3;

	public Hydra(String name, int level, int numberOfHealthPoints, int force, int position, int poisonDose) {
		super(name, level, numberOfHealthPoints, force, position);
		this.poisonDose = poisonDose;
	}

	public void moveNeck(int neckLength) {
		super.move(neckLength);
	}

	public void injectPoison(Dragon dragon) {
		int distance = Math.abs(super.position - dragon.position);
		// System.out.println("***************distance from class hydra " + distance);
		if (super.alive() || dragon.alive()) {
			if (distance <= MAX_DISTANCE) {
				int attack = super.attackPoints() + poisonDose;
				dragon.weak(attack);
				if (super.alive()) {
					if (!dragon.alive()) {
						super.level += 1;

					}
				}
			} else {
				System.out.println(this.name + "not in range");
			}
		}
	}

}
