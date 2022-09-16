package bai8;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryConvert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int number = Integer.parseInt(sc.nextLine());
        while (number > 0) {
            int temp = number % 2;
            stack.push(temp);
            number = number / 2;
        }
        System.out.println("Decimal Binary is : ");
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}
