import java.util.*;
class Triangle {
    double calculate(double b, double h){
        return (b * h)/2;
    }
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        double base, height;
        double Area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base : ");
        base = s.nextInt();
        System.out.print("Enter height : ");
        height = s.nextInt();
        Area = t1.calculate(base, height);
        System.out.println("Area of triangle is : "+Area);
    }
}
