import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice !=0 && choice !=1 && choice !=2 && choice !=3) {
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "1. Quản lí sản phẩm" + "             " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "2. Quản lí người dùng" + "           " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "3. Quản lí đơn đặt hàng" + "         " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
            System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
            System.out.println("Vui lòng nhập lựa chọn của bạn :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "        " + "1. Thêm sản phẩm" + "                " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "        " + "2. Xóa sản phẩm" + "                 " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "        " + "3. sửa sản phẩm" + "                 " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "        " + "4. Trở Lại" + "                      " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "        " + "0. Thoát" + "                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("Vui lòng nhập lựa chọn của bạn :");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 4:
                            choice = -1;
                            break;
                        case 0 :
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "1. Thêm người dùng" + "                " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "2. Sửa thông tin người dùng" + "       " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "3. Hiện danh sách người dùng" + "      " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "3. Xóa thông tin người dùng" + "       " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "4. Quay Lại" + "                       " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "      " + "0. Thoát" + "                          " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("Vui lòng nhập lựa chọn của bạn :");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 4:
                            choice = -1;
                            break;
                        case 0 :
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "1. Hiện thông tin đơn đặt hàng" + "     " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "2. Sửa đơn đặt hàng" + "                " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "3. Xóa đơn đặt hàng" + "                " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "3. Thêm đơn đặt hàng" + "               " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "4. Quay lại" + "                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "     " + "0. Thoát" + "                           " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E " + "                                        " + " \uD83D\uDC8E ");
                    System.out.println("\uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E  \uD83D\uDC8E ");
                    System.out.println("Vui lòng nhập lựa chọn của bạn :");
                    choice = scanner.nextInt();
                    switch (choice){
                        case 4:
                            choice = -1;
                            break;
                        case 0 :
                            System.out.println("Hẹn Gặp Lại!!!");
                            System.exit(0);
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Hẹn Gặp Lại!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui Lòng Nhập Lại!");
                    choice = -1;
            }
        }
    }
}
