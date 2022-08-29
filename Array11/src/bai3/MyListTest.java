package bai3;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listNumber = new MyList<>(10);
        listNumber.add(0, 1);
        listNumber.add(1, 2);
        listNumber.add(2, 3);
        listNumber.add(3, 4);
        listNumber.add(4, 5);
        listNumber.add(5, 6);
        listNumber.add(6, 7);
        listNumber.add(7, 8);
        listNumber.add(8, 9);
        listNumber.add(9, 10);
        listNumber.add(17, 15);
        listNumber.printMyList();
        System.out.println(listNumber.get(5));
        if (listNumber.contains(5))

            System.out.println("Yes!");
        else
            System.out.println("No!");


        if (listNumber.contains(55))
            System.out.println("Yes!");
        else
            System.out.println("No!");


    }
}
