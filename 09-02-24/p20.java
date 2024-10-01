import java.util.*;

class NestedIfElse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = s.nextInt();

        if(num > 0){
            if(num % 2 == 0){
                System.out.println("Number is positive and even");
            }
            else {
                System.out.println("Number is positive and odd");
            }
        }
        else if(num == 0){
            System.out.println("Number is zero");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
