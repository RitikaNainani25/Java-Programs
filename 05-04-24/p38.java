class A {
    void display(){
        System.out.println("Hello");
    }
}
class B extends A {
    void show(){
        System.out.println("Bye");
    }
}
class SingleInheritance {
    public static void main(String args[]){
        B obj = new B();
        obj.display();
        obj.show();
    }
}
