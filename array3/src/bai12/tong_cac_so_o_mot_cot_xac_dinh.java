package bai12;

import java.util.Scanner;

public class tong_cac_so_o_mot_cot_xac_dinh {
    public static void main(String[] args) {
        int[][] array = new int[2][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + (j + 1) + " in array" + (i + 1) + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập số cột: ");
        int k = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][k];
        }
        System.out.println("Tổng các số ở cột "+ k + " là " + total);
    }
}