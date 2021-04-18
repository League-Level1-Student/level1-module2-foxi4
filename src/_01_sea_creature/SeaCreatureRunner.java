package _01_sea_creature;

public class SeaCreatureRunner {
 public static void main(String[] args) {

	SeaCreature creature1 = new SeaCreature("Spongebob");
	creature1.eat();
	creature1.laugh();
	SeaCreature creature2 = new SeaCreature("Patrick");
	creature2.getName();
	creature2.eat();
	creature2.laugh();
	SeaCreature creature3 = new SeaCreature("Squidward");
	creature3.getName();
	creature3.eat();
	creature3.laugh();
	System.out.println("They are all eating krabby patties!");
 }
}
