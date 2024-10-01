import java.util.*;

class SwitchCase {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = s.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = s.nextInt();

        System.out.print("Choose any operator : ");
        Character choice = s.next().charAt(0);

        switch(choice){
            case '+':
                System.out.println("Addition of two numbers : "+(n1+n2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers : "+(n1-n2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers : "+(n1*n2));
                break;
            case '/':
                System.out.println("Division of two numbers : "+(n1/n2));
                break;
            case '%':
                System.out.println("Modulus of two numbers : "+(n1%n2));
                break;
            default:
                System.out.println("Invalid Operator");    
        }
    }
}
