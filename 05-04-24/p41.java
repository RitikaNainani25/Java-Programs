class finalVar{
    final int a = 10;
    void show(){
        System.out.println("The value of final variable is : "+a);
    }
    public static void main(String args[]){
        finalVar obj = new finalVar();
        obj.show();
    }
}