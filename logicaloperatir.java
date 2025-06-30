import java.util.*;
public class logicaloperatir {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a value : ");
        int a=sc.nextInt();
        System.out.println("enter b value : ");
        int b=sc.nextInt();
    
            System.out.println(a!=b && a<b);
            System.out.println(a>b || a==b);
            System.out.println(!(a<b || b>=a));
    }

}
