package bai10;

import java.util.Scanner;

public class phan_tu_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][5];
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + (j+1) + " in array"+ (i+1)+" :");
                array[i][j] = scanner.nextInt();
                min = array[0][0];
                if(min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.printf("Số nhỏ nhất trong mảng hai chiều là : %d ",min);
    }
}
