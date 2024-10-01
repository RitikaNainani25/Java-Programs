class finalMethod{
    final int add(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
       finalMethod obj = new finalMethod();
       int val = obj.add(50, 30);
       System.out.println("This is the final method value : "+val);
    }
}
