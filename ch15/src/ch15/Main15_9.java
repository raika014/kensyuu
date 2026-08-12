package ch15;

public class Main15_9 {
	public static void main(String[] args) {
	    Hero hero = new Hero();
	    hero.name = "minato";
	    hero.job = "hero";
	    hero.gold = 280;

	    final String FORMAT = "%-9s %-13s 所持金%,6d";
	    String s = String.format(FORMAT,hero.getName(),hero.getGold());
	    System.out.println();
}

}