package _02_sea_creature;

public class Runner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature pat = new SeaCreature("Patrick");
		pat.eat();
		pat.laugh();
		SeaCreature sq = new SeaCreature("Squidward");
		sq.eat();
		sq.laugh();
	}
}
