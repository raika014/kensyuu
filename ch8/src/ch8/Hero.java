package ch8;

public class Hero {
	String name;
    int hp;

    public void sit(int sec) {
        System.out.println(name + "は" + sec + "秒座った！");
    }

    public void slip() {
        System.out.println(name + "は転んだ！");
    }

    public void run() {
        System.out.println(name + "は逃げた！");
    }

}
