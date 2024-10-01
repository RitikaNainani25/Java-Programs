import java.util.*;

class Array{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter array elements are : ");
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }

        System.out.print("Array elements are :\n");
        for(int i = 0; i < size; i++){
            System.out.println("Element at index " + i + ": " +arr[i]);
        }

        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements are : "+sum);
    }
}