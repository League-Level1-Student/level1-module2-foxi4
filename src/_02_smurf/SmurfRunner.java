package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf smurf = new Smurf("Handy Smurf");
	smurf.eat();
	smurf.getName();
	Smurf papaSmurf = new Smurf("Papa Smarf");
	papaSmurf.getName();
	papaSmurf.getHatColor("blue");
	Smurf smurfette = new Smurf("Smurfette");
}
}
