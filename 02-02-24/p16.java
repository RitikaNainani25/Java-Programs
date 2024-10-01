class localVariable{
    void display(){
        int num = 100;
        System.out.println("The value of local variable is : "+num);
    }
    public static void main(String args[]){
        localVariable obj = new localVariable();
        obj.display();
    }
}
