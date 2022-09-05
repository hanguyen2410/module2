package JavaCollection;

public class Food implements Comparable<Food> {
    private int id;
    private int price;
    private String name;



    public Food(int id ,String name, int price) {
        this.id =  id;
        this.name = name;
        this.price = price;


    }

    public int getId() {
        return id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Food food) {
        return this.getName().compareTo(food.getName());
    }
}
