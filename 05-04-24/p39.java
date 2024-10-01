import java.util.*;
class A {
    void add(int n1, int n2){
        System.out.println("Addition of n1 and n2 is : "+(n1+n2));
    }
}
class B extends A {
    void sub(int n1, int n2){
        System.out.println("Subtraction of n1 and n2 is : "+(n1-n2));
    }
}
class C extends B {
    void mul(int n1, int n2){
        System.out.println("Multiplication of n1 and n2 is : "+(n1*n2));
    }
}
class MultilevelInheritance{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int n1 = s.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = s.nextInt();

        C obj = new C();
        obj.add(n1, n2);
        obj.sub(n1, n2);
        obj.mul(n1, n2);
    }
}
