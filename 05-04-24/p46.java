interface A {
   public void show();
}
interface B extends A {
    public void display();
}
class C implements B {
    public void show(){
        System.out.println("Ritika");
    }
    public void display(){
        System.out.println("Nainani");
    }

}
class Interface {
    public static void main(String args[]){
        C obj = new C();
        obj.show();
        obj.display();
    }
}