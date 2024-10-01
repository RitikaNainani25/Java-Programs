class thisMethod{
    int n;
    thisMethod(int n){
        this.n = n;
    }
    void print(){
        System.out.println(this.n);
    }

    public static void main(String[] args) {
        int x = 10;
        thisMethod n = new thisMethod(x);
        n.print();
    }
}
