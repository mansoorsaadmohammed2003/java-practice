import java.util.*;

public class tataoperators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value : ");
        int a=sc.nextInt();
        System.out.println("enter b value :");
        int b=sc.nextInt();
        System.out.println("enter c value : ");
        int c=sc.nextInt();
        System.out.println("enter d value :");
        int d=sc.nextInt();
        System.out.println("addition = " + (a+b+c+d));
        System.out.println("subtraction = " + (a-b-c-d));
        System.out.println("division = "+(a/b));
        System.out.println("multiplication = "+(a*b*c*d));
        System.out.println("modulo = "+(a%b));

    }
}