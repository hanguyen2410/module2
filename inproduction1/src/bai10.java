import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Vào Số USD:");
        double rate, vND = 23000;
        double uSD = scanner.nextDouble();
        rate = uSD * vND ;
        System.out.println(uSD + " USD đổi được thành :" + rate +" VNĐ");
    }
}
