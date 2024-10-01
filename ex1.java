import java.io.*;
class A {
    int add(int a, int b){
        return a+b;
    }
}
class B extends A {
    int sub(int a, int b){
        return a-b;
    }
}
class C extends B {
    int mul(int a, int b){
        return a*b;
    }
}
class Main {
    public static void main(String[] args) throws IOException{
        C obj = new C();
        DataInputStream d = new DataInputStream(System.in);
        
        int x = Integer.parseInt(d.readLine());
        int y = Integer.parseInt(d.readLine());
        
        int a = obj.add(x,y);
        System.out.println("Addition is : "+a);
        
        int b = obj.sub(x,y);
        System.out.println("Subtraction is : "+b);
        
        int c = obj.mul(x,y);
        System.out.println("Multiplication is : "+c);
    }
}