import java.util.*;
class Program2 {
    public static void main(String args[]){
        int p, r, t;
        double S;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter principal : ");
        p = s1.nextInt();
        System.out.print("Enter rate : ");
        r = s1.nextInt();
        System.out.print("Enter time : ");
        t = s1.nextInt();
        S = (p * r * t)/100;
        System.out.println("Simple Interest is : "+S);
    }
}
