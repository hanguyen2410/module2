public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(String name, int age) {
        setAge(this.age = age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age!!");
            return;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
