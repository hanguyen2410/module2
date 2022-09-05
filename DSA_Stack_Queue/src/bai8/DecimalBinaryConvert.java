package bai8;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryConvert {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();
        while (num > 0) {
            int temp = num % 2;
            stack.push(temp);
            num = num / 2;
        }
        System.out.println("Decimal Binary is : ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.pop());
        }
    }
}
