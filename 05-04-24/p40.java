class Animal {
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
class HeirarchicalInheritance{
    public static void main(String args[]){
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog Properties");
        d.eat();
        d.bark();
        
        System.out.println("\nCat Properties");
        c.eat();
        c.meow();
    }
}