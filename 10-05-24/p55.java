class Exception {
    public static void main(String[] args) {
        try{
            int result = divide(5,0);
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Error occured : "+e.getMessage());
        }
    }
    public static int divide(int n1, int n2){
        return n1/n2;
    }
}