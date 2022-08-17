public class Animal {
    private String name;
    private int age;
    private boolean gender;
    public  Animal(){}
    public Animal(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String toString() {
        return "The Animal is : " + getName() + " is " + getAge() + " Years old" + " and Gender is " + isGender();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
        animal = new Animal("Dog", 5, true);
        System.out.println(animal.toString());
        animal.setName("Cat");
        animal.setAge(3);
        animal.setGender(false);
        System.out.println(animal.toString());
    }

}
