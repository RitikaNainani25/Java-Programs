class thisVar{
int a;

thisVar(int a){
this.a = a;
}

void display(){
System.out.println("The value of a is :"+ a);
}

public static void main(String args[]){
thisVar t1 = new thisVar(20);
t1.display();
}
}