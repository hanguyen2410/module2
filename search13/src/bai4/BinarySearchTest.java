package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the " + list.length + " values :");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        bubbleSort(list);
        System.out.println("Your List is : " + Arrays.toString(list));

        System.out.println("Vị trí 5số cần tìm là : "+binarySearch(list, 0, size -1, 5));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (right > left) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return middle;
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
