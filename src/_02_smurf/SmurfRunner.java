package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf smurf = new Smurf("Handy Smurf");
	smurf.eat();
	smurf.getName();
	smurf.getHatColor("white");
	smurf.isGirlOrBoy("male");
	Smurf papaSmurf = new Smurf("Papa Smurf");
	papaSmurf.eat();
	papaSmurf.getName();
	papaSmurf.getHatColor("red");
	papaSmurf.isGirlOrBoy("male");
	Smurf smurfette = new Smurf("Smurfette");
	smurfette.eat();
	smurfette.getName();
	smurfette.getHatColor("white");
	smurfette.isGirlOrBoy("female");
}
}
