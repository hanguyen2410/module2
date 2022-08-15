package bai2;

import bai1.Circle;

public class CircleTest {
    public static void main(String[] args) {
        bai2 circle = new bai2();
        System.out.println(circle);
        circle = new bai2(3.5, "red");
        System.out.println(circle);
        circle = new bai2(3.5, "yellow");
        System.out.println(circle);
    }
}
