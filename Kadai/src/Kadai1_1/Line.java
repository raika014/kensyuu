package Kadai1_1;

public class Line implements Figure {

    @Override
    public void draw() {
        System.out.println("[線を描画] 始点(0,0)から終点(100,100)まで");
    }
}