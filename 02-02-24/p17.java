class Casting{
    public static void main(String args[]){
        System.out.println("Implicit Casting");
        int num1 = 50;
        double num2 = num1;

        System.out.println("Before casting : "+num1);
        System.out.println("After casting : "+num2);

        System.out.println("\nExplicit Casting");
        double num3 = 25.68;
        int num4 = (int)num3;

        System.out.println("Before casting : "+num3);
        System.out.println("After casting : "+num4);

    }
}
