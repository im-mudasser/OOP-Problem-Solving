package com.oop.assignment5.Question2;

public class ClashOfTheTitans {
	public void Fight(Dragon d, Hydra h) {

		h.injectPoison(d);
		d.blowFlame(h);
	}

	public static void main(String[] args) {
		ClashOfTheTitans fight = new ClashOfTheTitans();
		System.out.println("************ 1st Fight*****************");
		Dragon d = new Dragon("Dragon red ", 2, 10, 3, 0, 6);
		Hydra h = new Hydra("Hydra evil ", 2, 10, 1, 42, 0);
		fight.Fight(d, h);
		System.out.println();
		System.out.println("***********After the Fight :*************");
		d.display();
		h.display();
		System.out.println();
		System.out.println("************ 2nd Fight*****************");
		// 2nd fight
		d.fly(41);
		h.moveNeck(1);
		h.poisonDose = 1;
		fight.Fight(d, h);
		System.out.println();
		System.out.println("***********After the Fight :*************");
		d.display();
		h.display();
		System.out.println();
		System.out.println("************ 3rd Fight*****************");
		// 3rd fight
		d.fly(1);
		h.poisonDose = 1;
		fight.Fight(d, h);
		System.out.println();
		System.out.println("***********After the Fight :*************");
		d.display();
		h.display();

	}

}
