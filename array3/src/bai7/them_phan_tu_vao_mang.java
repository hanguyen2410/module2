package bai7;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] array = {7, 2, 5, 8, 9, 3, 4, 6, 12, 15, 17, 19, 21, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to add: ");
        int x = scanner.nextInt();
        System.out.println("Enter the index of number: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Position is not in array!!");
            return;
        } else {
            for (int j = array.length-1; index < j; j--) {
                array[j] = array[j - 1];
            }
            array[index] = x;
        }
        System.out.println("Mảng mới là : " + Arrays.toString(array));
    }
}

