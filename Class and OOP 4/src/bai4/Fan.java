package bai4;

public class Fan {
    int speed;
    boolean on;
    double radius;
    String color;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public Fan() {
       this.speed = SLOW;
       this.on = false;
       this.radius = 5;
       this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
         if(this.on) {
             return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        else {
            return "Fan{" + "color : "+ color + " radius : " + radius +"}";
         }
    }
}
