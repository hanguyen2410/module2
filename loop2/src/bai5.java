import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle bot-left");
            System.out.println("3. Draw the triangle top-left");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Draw the rectangle");
                    for(int i = 1; i < 4 ; i++){
                        for(int j = 1; j < 7; j++){
                            System.out.print("*  ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2 :
                    System.out.println("Draw the triangle bot-left");
                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3 :
                    System.out.println("Draw the triangle top-left");
                    for (int i = 7; i > 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:

                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i < 5; i++ ){
                        for (int j = 1; j <= 5 - i; j++){
                            System.out.print("  ");
                        }

                        for (int k = 0; k != 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
