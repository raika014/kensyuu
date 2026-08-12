package ch14;

public class HeroA {
	  String name;
	  int hp;
	  static int money;
	  /* … */
	  static void setRandomMoney() {
	    HeroA.money = (int)(Math.random() * 1000);
	  }
	}


