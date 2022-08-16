package bai4;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = scanner.nextInt();
        int [] list = new int[size];
        System.out.println("Enter the " + list.length + "values :");
        for (int i = 0; i < list.length; i++){
            list[i] = scanner.nextInt();
        }
        BubbleSort(list);
        System.out.println("Your List is : " + Arrays.toString(list));
        
    }
    public static int binarySearch(int[] array , int left , int right, int value){
        int middle = (left + right) / 2;
        while(right > left){
            if(array[middle] == value){
                return middle;
            }
            else if(value > array[middle]){
                left = middle +1;
            } else {
                right = middle -1;
            }
        }
        return middle;
    }
    public static void BubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i = 0; i< list.length && needNextPass; i++){
            needNextPass = true;
            for (int j =0 ; j < list.length - i; j++){
                if (list[j] > list[j+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = false;
                }
            }
        }
    }
}
