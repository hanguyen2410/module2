package bai6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square(3.0,"red",true);
        System.out.println("Arrays before sorted is : "+ Arrays.toString(shapes));
        for (Shape shape : shapes){
            shape.howToColor();
        }
        System.out.println("Arrays after sorted is : " + Arrays.toString(shapes));
    }
}
