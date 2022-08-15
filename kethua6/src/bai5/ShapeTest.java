package bai5;

import bai1.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        bai1.Shape shape = new bai1.Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
