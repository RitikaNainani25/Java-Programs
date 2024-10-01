import java.util.*;
class Program4 {
    public static void main(String args[]){
        double base, height, width;
        double triangle, rectangle;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter base : ");
        base = s1.nextInt();
        System.out.print("Enter height : ");
        height = s1.nextInt();
        System.out.print("Enter width : ");
        width = s1.nextInt();
        triangle = (base * height)/2;
        rectangle = height * width;
        System.out.println("Area of Triangle is : " +triangle);
        System.out.println("Area of Rectangle is : " +rectangle);
    }
}
