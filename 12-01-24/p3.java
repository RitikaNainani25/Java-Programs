import java.util.*;
class Program3 {
    public static void main(String args[]){
        int radius;
        double area;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter radius : ");
        radius = s1.nextInt();
        area = 3.14 * radius * radius;
        System.out.println("Area of circle is : "+area);
    }
}
