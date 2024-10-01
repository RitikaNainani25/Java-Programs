import java.util.*;

class EntryLoops {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = s.nextInt();

        System.out.println("Using for Loop");
        for(int i = 1; i <= n; i++){
            System.out.println("Iteration "+i);
        }

        System.out.println("\nUsing for Loop");
        int j = 1;
        while(j <= n){
            System.out.println("Iteration "+j);
            j++;
        }
    }
}