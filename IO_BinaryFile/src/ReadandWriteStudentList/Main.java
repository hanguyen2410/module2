package ReadandWriteStudentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyễn Hà","Hue"));
        students.add(new Student(2,"Khanh Gà","Hue"));
        students.add(new Student(3,"Bình Rau","Hue"));
        students.add(new Student(4,"Lộc Shado","Hue"));
        students.add(new Student(5,"Tùng Lý","Hue"));
        writeToFile("student.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for(Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
