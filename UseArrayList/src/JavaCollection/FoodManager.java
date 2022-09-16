package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class FoodManager {
    private ArrayList<Food> foods = new ArrayList<>();

    public FoodManager() {
    }

    public void add(int id, String name, int price) {
        for (int i = 0; i < foods.size(); i++) {
            if (id == foods.get(i).getId()) {
                System.out.println("ID đã tồn tại!! Vui lòng nhập id khác");
            }
            foods.add(new Food(id, name, price));
        }
    }

    public void edit(int id, String name, int price) {
        for (int i = 0; i < foods.size(); i++)
            if (id == foods.get(i).getId()) {
                foods.get(i).setName(name);
                foods.get(i).setPrice(price);
                foods.set(i, foods.get(i));
            }

    }

    public void remove(int id) {
        foods.removeIf(dish -> dish.getId() == id);
    }

    public void render() {
        for (Food dish : foods) {
            System.out.println(dish.toString());
        }
    }

    public void findFoodName(String name) {
        ArrayList<Food> findFoods = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().toUpperCase().contains(name.toUpperCase())) {
                System.out.println(foods.get(i));
                count++;
            }
        }
        if (count == 0)
            System.out.println("dish is not on the list");
    }


    public void sortAscending() {
        foods.sort((o1, o2) -> Integer.compare((int) o1.getPrice(), (int) o2.getPrice()));
        for (Food dish : foods
        ) {
            System.out.println(dish.toString());
        }
    }

    public void sortDescending() {
        foods.sort((o1, o2) -> Integer.compare((int) o2.getPrice(), (int) o1.getPrice()));
        for (Food dish : foods
        ) {
            System.out.println(dish.toString());
        }
    }

}
