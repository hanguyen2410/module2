import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố");
        int numbers;
        int count = 0;
        int n = 2;
        int j = 0;
        numbers = scanner.nextInt();
        for ( n = 2 ; n < 1000 ; n++) {
            if (count < numbers) {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        j++;
                    }
                }
                if (j == 2) {
                    System.out.println(n);
                    count++;
                }
                j =0;
            } else {
                break;
            }
        }
    }
}