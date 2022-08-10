import java.util.Scanner;
public class bcnn2So {
    public static void main(String[] args) {
        int bCNN;
        int uCLN = 1;
        int num1;
        int num2;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("nhập số thứ nhất : ");
        num1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("nhập số thứ hai : ");
        num2 = scanner2.nextInt();
        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                uCLN = i;
            }
        }
        bCNN = (num1 * num2) / uCLN;
        System.out.println("BCNN của 2 số " + num1 + " và " + num2 + " là : " + bCNN);
    }
}