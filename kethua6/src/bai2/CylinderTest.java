package bai2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0,"yellow",3.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(3.5, "red",2.0);
        System.out.println(cylinder);
    }
}
