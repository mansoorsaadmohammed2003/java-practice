import java.util.*;
public class bitwiseoperators {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a value : ");
        int a=sc.nextInt();
        System.out.println("enter b value : ");
        int b=sc.nextInt();
    
        System.out.println("AND "+(a&b));
        System.out.println("OR "+(a|b));
        System.out.println("XOR "+(a^b));
        System.out.println("compliment "+~a);
        System.out.println("Left shift "+(a << 3));
        System.out.println("Right shiuft "+ (a>>1));
        

    }
}
