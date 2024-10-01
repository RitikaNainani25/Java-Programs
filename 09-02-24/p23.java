import java.util.*;

class BreakContinue {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = s.nextInt();

        System.out.println("Using break statement");
        for(int i = 1; i <= n; i++){
            if(i == 4){
                break;
            }
            System.out.println("Iteration "+i);
        }

        System.out.println("\nUsing continue statement");
        for(int i = 1; i <= n; i++){
            if(i == 4){
                continue;
            }
            System.out.println("Iteration "+i);
        }
    }
}