import java.util.*;
class SI{
int calculate(int p, int r, int t){
return (p * r * t)/100;
}
public static void main(String args[]){
SI s1 = new SI();
int p, r, t, SimpleInterest;
Scanner sc = new Scanner(System.in);
System.out.print("Enter principal : ");
p = sc.nextInt();
System.out.print("Enter interest rate : ");
r = sc.nextInt();
System.out.print("Enter time : ");
t = sc.nextInt();
SimpleInterest = s1.calculate(p, r, t);
System.out.println("The result is : "+SimpleInterest);
}
}