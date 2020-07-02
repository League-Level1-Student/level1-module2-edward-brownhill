package _03_smurf;

public class RunnerSmurf {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		System.out.println(handy.getName());
		handy.eat();
		Smurf papa = new Smurf("Papa Smurf");
		papa.eat();
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		Smurf ette = new Smurf("Smurfette");
		ette.eat();
		System.out.println(ette.getHatColor());
		System.out.println(ette.isGirlOrBoy());
	}
}
