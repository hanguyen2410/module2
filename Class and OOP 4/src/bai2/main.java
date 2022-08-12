package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a , b ,c);
        if(quadraticEquation.getDiscriminant() > 0) {
            System.out.printf("Phương trình có 2 nghiệm là : x1 = %f và x2 = %f ",  quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.printf("Phương trình có 1 nghệm kép là : x = %f" , quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
