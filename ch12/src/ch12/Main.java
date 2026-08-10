package ch12;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matano();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
	}
}
