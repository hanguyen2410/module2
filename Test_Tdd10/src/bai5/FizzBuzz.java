package bai5;

public class FizzBuzz {
    public static String fizzBuzz1(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = number % 3 == 0 && number % 5 == 0;
        if (isFizzBuzz)
            return "FizzBuzz";
        else if (isBuzz)
            return "Buzz";
        else if (isFizz)
            return "Fizz";
        else
            return String.valueOf(number);
    }

    public static String fizzBuzz2(int number) {
        boolean isFizz = (number / 10 == 3) || (number % 10 == 3);
        boolean isBuzz = (number / 10 == 5) || (number % 10 == 5);
        if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String fizzBuzz3(int number) {
        int hangchuc = number / 10;
        int hangdonvi = number % 10;
        String wordHangChuc= "";
        String wordHangDonVi= "";
        switch (hangchuc) {
            case 1:
                wordHangChuc = "mot";
                break;
            case 2:
                wordHangChuc = "hai";
                break;
            case 3:
                wordHangChuc = "Fizz";

                break;
            case 4:
                wordHangChuc = "bon";
                break;
            case 5:
                wordHangChuc = "Buzz";
                break;
            case 6:
                wordHangChuc = "sau";
                break;
            case 7:
                wordHangChuc = "bay";
                break;
            case 8:
                wordHangChuc = "tam";
                break;
            case 9:
                wordHangChuc = "chin";
                break;
            default:
                System.out.println("number invalid");
                break;
        }
        switch (hangdonvi) {
            case 1:
                wordHangDonVi = "mot";
                break;
            case 2:
                wordHangDonVi = "hai";
                break;
            case 3:
                wordHangDonVi = "Fizz";

                break;
            case 4:
                wordHangDonVi = "bon";
                break;
            case 5:
                wordHangDonVi = "Buzz";
                break;
            case 6:
                wordHangDonVi = "sau";
                break;
            case 7:
                wordHangDonVi = "bay";
                break;
            case 8:
                wordHangDonVi = "tam";
                break;
            case 9:
                wordHangDonVi = "chin";
                break;
            default:
                System.out.println("Number Invalid");
                break;
        }
        return wordHangChuc+wordHangDonVi;
    }
}
