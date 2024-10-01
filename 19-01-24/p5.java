import java.util.*;
class Circle{
double area(int radius){
return (3.14 * radius * radius);
}
public static void main(String args[]){ 
Circle c1 = new Circle();
int radius;
double result;
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius : ");
radius = sc.nextInt();
result = c1.area(radius);
System.out.println("The result is : "+result);
}
}