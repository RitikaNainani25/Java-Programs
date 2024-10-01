import java.util.*;
class Rectangle{
    int calculate(int w, int h){
        return w*h;
    }
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        int width, height, Area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width : ");
        width = s.nextInt();
        System.out.print("Enter height : ");
        height = s.nextInt();
        Area = r1.calculate(width, height);
        System.out.println("Area of rectangle is : "+Area);
    }
}