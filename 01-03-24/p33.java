class User {
    int id;
    String name;

    User(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name is "+name+" and user id is "+id);
    }

    public static void main(String args[]){
       User obj = new User("Ritika", 1);
       obj.display();
    }
    
}