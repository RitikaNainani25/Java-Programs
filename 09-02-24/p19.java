import java.util.*;

class IfElse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = s.nextInt();

        //if statement
        if(num > 0){
            System.out.println("Number is Positive");
        }

        //if-else statement
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

        //if-else if-else statement
        if(num > 0){
            System.out.println("Number is Positive");
        }
        else if(num == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}