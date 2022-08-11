package bai9;

import java.util.Scanner;

public class phan_tu_lon_nhat_trong_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + (j+1) + " in array"+ (i+1)+" :");
                array[i][j] = scanner.nextInt();

            }
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max <array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.printf("Số lớn nhất trong mảng hai chiều là : %d ",max);
    }
}
