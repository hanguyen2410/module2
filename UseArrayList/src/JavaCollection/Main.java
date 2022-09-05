package JavaCollection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodManager foodManager = new FoodManager();
        ShowMenu menuList = new ShowMenu();
        int choice = -1;
        foodManager.add(1,"Cơm Tấm", 30000);
        foodManager.add(2,"Cơm Gà", 40000);
        foodManager.add(3,"Bún Bò Huế", 35000);
        foodManager.add(4,"Cơm Sườn Bì Chả", 40000);
        foodManager.add(5,"Phở Bò Tái", 45000);
        foodManager.add(6,"Cơm Đặc Biệt", 30000);
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 && choice != 7 && choice != 0) {
            menuList.menuList();
            System.out.println("Enter your Choice : ");
            System.out.print("︻╦╤─҉–– ");
            choice = Integer.parseInt(scanner.nextLine());
            String name;
            int id, price;
            switch (choice) {
                case 1:
                    foodManager.render();
                    System.out.println("Thêm ID :");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Thêm Tên Món Ăn :");
                    name = scanner.nextLine();
                    System.out.println("Thêm Giá Món Ăn : ");
                    price = Integer.parseInt(scanner.nextLine());
                    foodManager.add(id,name, price);
                    System.out.println("Done");
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 2:
                    foodManager.render();
                    System.out.println("Nhập ID muốn xóa : ");
                    id = Integer.parseInt(scanner.nextLine());
                    foodManager.remove(id);
                    System.out.println("Đã xóa thành công");
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 3:
                    foodManager.render();
                    System.out.println("Nhập ID Muốn sủa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập Tên Món Ăn Muốn sửa");
                    name = scanner.nextLine();
                    System.out.println("Nhập giá muốn sửa : ");
                    price = Integer.parseInt(scanner.nextLine());
                    foodManager.edit(id,name,price);
                    System.out.println("Đã sửa thành công");
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 4:
                    foodManager.render();
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên món ăn cần tìm : ");
                    name = scanner.nextLine();
                    foodManager.findFoodName(name);
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Sắp xếp tăng dần");
                    foodManager.sortAscending();
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Sắp xếp giảm dần");
                    foodManager.sortDescending();
                    System.out.println("➤ Import 1 back to main menu  or 2 to exit.");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            choice = -1;
                            break;
                        case 0:
                            choice = 0;
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

