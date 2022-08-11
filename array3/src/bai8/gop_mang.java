package bai8;

import java.util.Arrays;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element "+ (i+1) + " in array1:");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter value in array2: ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1 Là : " +Arrays.toString(array1));
        System.out.println("Mảng 2 Là : " +Arrays.toString(array2));
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
            array3[array1.length + j] = array2[j];
        }
        System.out.println("Mảng 3 Là :" + Arrays.toString(array3));
    }
}
