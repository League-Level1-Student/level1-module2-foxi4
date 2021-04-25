package _02_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. & 4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;
	public String hatcolor;

	Smurf(String name) {
		this.name = name;
	}

	
	public String getName() {
		System.out.println("Their name is " + name + ".");
		return "Their name is " + name + ".";
	}

	public void eat() {
		System.out.println(name + " is eating Smurfberries.");
	}

	// Papa Smurf wears a red hat, all the others are white.
	public String getHatColor(String hatcolor) {
		// 3. Fill in this method
this.hatcolor = hatcolor;
System.out.println("Their hat color is " + hatcolor + ".");
return "Their hat color is " + hatcolor + ".";
	}

	// Smurfette is the only female Smurf.
	public String isGirlOrBoy(String gender) {
		// 4. Fill in this method
		System.out.println(name+ " is " + gender + ".");
		return name + " is " + gender;
	}

}


