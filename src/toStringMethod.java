
class Person {
    String name;
    int age;

    boolean gender; // male-true : female-false

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ']';
    }
}

public class toStringMethod {
    public static void main(String[] args) {
        Person p1 = new Person("Om Prakash Mallik",23,true);
        Person p2 = new Person("Jay Prakash Mallik",21,true);
        Person p3 = new Person("Sachin Kr. Mallik",19,true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        String str = "";
        System.out.println(str);
    }
}
