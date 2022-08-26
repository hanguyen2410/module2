package bai3;

import java.util.Arrays;
import java.util.Stack;

public class GenericStackClient {
    public static void main(String[] args) {
            int[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println("Array before sorted is : " + Arrays.toString(numbers));
            reverseArrayInt(numbers);
        System.out.println("Array after sorted is : " + Arrays.toString(numbers));

            String string = "Nguyen Van Ha";
        System.out.println("String before sorted is : " + string);
           string =  reverseArrayString(string);
        System.out.println("String after sorted is : " + string);
        }


        public static int[] reverseArrayInt(int[] numbers) {
            Stack<Integer> stack = new Stack<>();
            for(int i = 0 ; i < numbers.length; i++){
                stack.push(numbers[i]);
            }
            for(int i = 0 ; i < numbers.length; i++){
                numbers[i] = stack.pop();
            }

            return numbers;
        }
        public static String reverseArrayString(String str) {
        Stack<String> stack = new Stack<>();
            String newReverseString = "";
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + "");
        }
        for (int i = 0; i < str.length(); i++) {
            newReverseString += stack.pop();
        }
        return newReverseString;
        }
    }




