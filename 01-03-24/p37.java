class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student anotherStudent) {
        this.name = anotherStudent.name;
        this.age = anotherStudent.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Riya", 20);

        Student student2 = new Student(student1);

        System.out.println("Details of student1:");
        student1.display();

        System.out.println("\nDetails of student2 (copied from student1):");
        student2.display();

        student1.name = "Tanishka";
        student1.age = 19;

        System.out.println("\nAfter modifying student1:");

        System.out.println("Details of student1:");
        student1.display();

        System.out.println("\nDetails of student2:");
        student2.display();
    }
}