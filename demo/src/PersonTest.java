public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Trung", 3);
        Person person1 = new Person();
        person1.setAge(5);
        person1.setName("Hà");
        System.out.println("Tên tôi là " + person.getName() + " Và tôi "+ person.getAge()+" tuổi.");
        System.out.println("Tên tôi là " + person1.getName() + " Và tôi "+ person1.getAge()+" tuổi.");
    }

}
