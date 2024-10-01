import java.util.*;

class ExitLoops {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = s.nextInt();

        System.out.println("Using do while Loop");
        int i = 1;
        do {
            System.out.println("Iteration "+i);
            i++;
        }while(i <= n);
    }
}