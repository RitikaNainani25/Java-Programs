interface A {
    int add(int a, int b);
}
class B {
    int sub(int a, int b){
        return a-b;
    }
}
class C extends B {
    int mul(int a, int b){
        return a*b;
    }
}
class D extends B implements A {
    int div(int a, int b){
        return a/b;
    }
    public int add(int a, int b){
        return a+b;
    }
}
class HybridInheritance{
    public static void main(String args[]){
        C obj1 = new C();
        D obj2 = new D();
        
        int p = obj1.sub(50, 10);
        System.out.println("Subtraction is : "+p);
        
        int q = obj1.mul(20, 6);
        System.out.println("Multiplication is : "+q);

        int r = obj2.add(80, 10);
        System.out.println("Addition is : "+r);

        int s = obj2.div(40, 2);
        System.out.println("Division is : "+s);
    }
}