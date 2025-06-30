import java.util.Scanner;

public class assignmentoperator {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("enter a value : ");
        int a=sc.nextInt();
    
        System.out.println("a=a+5 : "+(a+=5));
        System.out.println("a=a-2 : "+(a-=2));
        System.out.println("a=a*5 : "+(a*=5));
        System.out.println("a=a/5 : "+(a/=5));
        System.out.println("a=a%5 : "+(a%=5));
        
        
    }
    
}
