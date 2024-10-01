class staticVar{
    static int count = 0;
    staticVar(){
        System.out.println("Object " + count + " Created");
        count++;
    }

    public static void main(String[] args) {
        staticVar o1 = new staticVar();
        staticVar o2 = new staticVar();
        staticVar o3 = new staticVar();
        System.err.println("No. of Objects : " + o1.count);
    }
}
