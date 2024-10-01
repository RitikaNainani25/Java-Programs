class Car {
    String color;

    Car(String color){
        this.color = color;
    }

    void displayColor(){
        System.out.println("The color of the car is : "+color);
    }

    public static void main(String args[]){
        Car obj = new Car("Black");
        obj.displayColor();
    }
}
