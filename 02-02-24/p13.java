import java.util.*;

class staticMethod{
    static void factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("The factorial is : "+fact);
    }

    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        num = s.nextInt();
        factorial(num);
    }
}
