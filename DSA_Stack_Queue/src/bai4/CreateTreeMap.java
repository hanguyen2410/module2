package bai4;

import java.util.Scanner;
import java.util.TreeMap;

public class CreateTreeMap {
    public static void main(String[] args) {
        System.out.println("Nhập vào chuỗi : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
            for (String element : arr) {
                if (wordCount.containsKey(element)) {
                    int value = wordCount.get(element);
                    value++;
                    wordCount.put(element,value);
                }
                else {
                    wordCount.put(element,1);
                }
            }
        System.out.println(wordCount);
    }
}
