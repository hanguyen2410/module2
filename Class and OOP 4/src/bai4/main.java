package bai4;

public class main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(3);
        Fan1.setOn(true);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        
        Fan Fan2 = new Fan();
        Fan2.setSpeed(2);
        Fan2.setOn(false);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
    }
}
