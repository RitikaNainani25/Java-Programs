import java.util.*;
class Program1 {
    public static void main(String args[]){
        int a, b, sum;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        a = s1.nextInt();
        System.out.print("Enter value of b : "); 
        b = s1.nextInt();
        sum = a + b;
        System.out.println("The Sum of two numbers is : "+sum);
    }
}
