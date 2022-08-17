package bai5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5,"yellow",false);
        shapes[1] = new Rectangle(4.2,2.5,"red",true);
        shapes[2] = new Square(3.5,"green",true);
        System.out.println("Shapes before sorted is : " + Arrays.toString(shapes));
        for (Shape shape : shapes) {
            shape.resize((Math.random()*100/100));
        }
        System.out.println("Shapes after sorted is : " + Arrays.toString(shapes));
    }
}
