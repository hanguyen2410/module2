package bai2;

public class bai2 {
    private double radius = 1.0;
    private String color = "green";
    public bai2(){}
    public bai2(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public  void setColor(){
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = "
                + getRadius()
                + ", Which is a subclass of "
                + getColor();
    }
}
