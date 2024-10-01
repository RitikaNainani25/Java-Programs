import java.io.*;

class Circle {
    double area(int radius){
        return (3.14 * radius * radius);
    }
    public static void main(String args[]) throws IOException{
        Circle obj = new Circle();
        DataInputStream d = new DataInputStream(System.in);

        double result;
        System.out.print("Enter radius : ");
        int radius = Integer.parseInt(d.readLine());

        result = obj.area(radius);

        System.out.println("Area of circle is : "+result);
    }
}