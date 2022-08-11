package bai13;

import java.util.Scanner;

public class tong_duong_cheo_chinh_cua_ma_tran {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + (j + 1) + " in array " + (i + 1) + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i][i];
        }
        System.out.println("tổng các số ở đường chéo ma trận là : " + total);
    }
}
