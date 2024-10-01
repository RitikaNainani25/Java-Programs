interface Swimmer {
    public void swim();
}

interface Flyer {
    public void fly();
}

class Duck implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Duck swims in water");
    }

    public void fly() {
        System.out.println("Duck flies in the sky");
    }
}

class MultipleInheritance{
    public static void main(String args[]){
        Duck obj = new Duck();
        obj.swim();
        obj.fly();
    }
}