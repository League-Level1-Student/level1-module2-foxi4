package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */
//playing music rn
public class TeaMaker {

	/* Figure out how to make a cup of tea in this runner class, using the other classes below */

	public static void main(String[] args) {
		Cup cup = new Cup();
		
		TeaBag teabag = new TeaBag("dried rose petal");
		teabag.getFlavor();
		Kettle water = new Kettle();
		Water water1 = water.getWater();
		water.boil();
		cup.makeTea(teabag, water1);
		
		//steps
		//make cup 
		//teabag flavor?
		//kettle (get water)
		//water should have place to put
		//make tea
		//look at parameters, if there are any.
		//that was confusing
		
	}
}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MINT = "Mint";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {
//use kettle to get water (see getWater method)
//
	private Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}
}


