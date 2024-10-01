import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = s.nextLine();

        System.out.print("Enter age: ");
        int age = s.nextInt();

        Person person = new Person(name, age);

        System.out.println("\nPerson Details:");
        person.display();

    }
}
