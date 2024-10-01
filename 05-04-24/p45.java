abstract class Shape{
    abstract int area(int l, int b);
}
class Rectangle extends Shape{
    int area(int l, int b){
        return l*b;
    }
}
class Triangle extends Shape{
    int area(int l, int b){
        return (l*b)/2;
    }
}
class abstractClass{
    public static void main(String args[]){
        Rectangle obj1 = new Rectangle();
        Triangle obj2 = new Triangle();

        int rArea = obj1.area(5, 9);
        int tArea = obj2.area(14, 5);

        System.out.println("Area of Rectangle is : "+rArea);
        System.out.println("Area of Triangle is : "+tArea);
    }
}
