class DefaultConstructor {
    int num;
    String str;

    DefaultConstructor(){}

    void display(){
        System.out.println("Default value of number is "+num);
        System.out.println("Default value of string is "+str);
    }

    public static void main(String args[]){
        DefaultConstructor obj = new DefaultConstructor();

        obj.display();
    }
}