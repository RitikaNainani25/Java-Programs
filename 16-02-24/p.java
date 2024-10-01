class Pattern1{
    void p1(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( j + " ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern2 extends Pattern1{
    void p2(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( i*2 + " ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern3 extends Pattern2{
    void p3(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( (i*2)+1 + " ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern4 extends Pattern3{
    void p4(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( i + " ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern5 extends Pattern4{
    void p5(){
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( "*" + " ");
            }
            System.out.print("\n");
        }
    }
}

class Pattern6 extends Pattern5{
    void p6(){
        for (int i = 0; i < 4; i++){       
            for (int j = 2*(4-i); j >= 0; j--){      
                System.out.print(" ");   
            }   
            for (int j = 0; j <= i; j++ ){        
                System.out.print("* ");   
            }   
            System.out.println();   
        }   
    }
}

class Patterns {
    public static void main(String[] args) {
        Pattern6 obj = new Pattern6();
        obj.p1();
        System.out.println();
        obj.p2();
        System.out.println();
        obj.p3();
        System.out.println();
        obj.p4();
        System.out.println();
        obj.p5();
        System.out.println();
        obj.p6();
    }
}