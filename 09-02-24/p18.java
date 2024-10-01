class SuperClass {
    //super class variable
    int var;

    //super class constructor 
    SuperClass(int var) {
        this.var = var;
    }

    //super class method
    void display() {
        System.out.println("This is super class Method");
    }
}

class SubClass extends SuperClass {

    SubClass(int var) {
        super(var); 
        System.out.println("This is super class constructor");
    }

    void show() {
        super.display();
    }

    void displayVariables() {
        System.out.println("This is super class variable : "+var);
    }
}

class Main {
    public static void main(String args[]) {
        SubClass obj = new SubClass(10);
        obj.show();  
        obj.displayVariables();
    }
}