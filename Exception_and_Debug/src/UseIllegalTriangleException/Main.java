package UseIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Cạnh x :");
        int x = scanner.nextInt();
        System.out.println("Nhập Cạnh y :");
        int y = scanner.nextInt();
        System.out.println("Nhập Cạnh z :");
        int z = scanner.nextInt();
        Main triangle = new Main();
        triangle.triangleException(x, y, z);
    }

    public void triangleException(int x, int y, int z) {
        try {
            int a = x + y;
            int b = x + z;
            int c = y + z;
            if (a <= z || x < 0 || y < 0 || z < 0 || b <= y  || c <= x ) {
                throw new IllegalTriangleException("");
            } else
                System.out.println("Tam giác hợp lệ");
        } catch (
                Exception ex) {
            System.err.println("Tam giác không hợp lệ " + ex.getMessage());
        }
    }

}
