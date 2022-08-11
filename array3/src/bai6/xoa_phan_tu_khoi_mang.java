package bai6;

import java.util.Scanner;

import java.util.Arrays;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int array[] =  new int[]{4, 2, 5, 7, 9, 3, 6, 11, 4, 18, 12, 21, 15};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to delete: ");
        int x = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
            }
        }
        for (; index < array.length; index++) {
            if (index == array.length - 1)
                array[index] = 0;
            else
                array[index] = array[index + 1];
        }

        System.out.println("Mảng mới là : " + Arrays.toString(array));
    }
}
