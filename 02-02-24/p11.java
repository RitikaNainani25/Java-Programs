class thisConstructor {
    thisConstructor(){
        this(20);
        System.out.println("Inside default constructor");
    }
    thisConstructor(int a){
        System.out.println("Inside parameterized constructor");
        System.out.println("The value of a is : "+a);
        System.out.println();
    }

    public static void main(String args[]){
        thisConstructor c = new thisConstructor();
    }
}
