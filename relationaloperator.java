import java.util.*;
public class relationaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a value : ");
        int a=sc.nextInt();
        System.out.println("enter b value : ");
        int b=sc.nextInt();

        System.out.println(a+" greater than "+b+" "+(a>b));
        System.out.println("less than "+(a<b));
        System.out.println("greater than equal to "+(a >= b));
        System.out.println("less than equal to "+(a <= b));
        System.out.println("bot equal to "+(a!=b));
        System.out.println("equal to "+(a==b));
        
    }
}
