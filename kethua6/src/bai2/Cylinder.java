package bai2;

public class Cylinder extends bai2 {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * height;
    }
    @Override
    public String toString(){
        return "A Cylinder with radius = "
                + getRadius()
                +", which a subclass of "
                +super.toString();
    }
}
