package bai5;

import java.util.Arrays;

public class InsertionSortSetup {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
        System.out.print("List after sort : ");
        System.out.print(Arrays.toString(list) + "\t");
        System.out.println();
    }
    }


