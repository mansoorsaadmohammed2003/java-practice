import java.util.Scanner;
class owners{
    public void person(String name , int age ){
        System.out.println(name+" "+age);
    }
    public void cat(String Cname , String color ){
        System.out.println(Cname+" "+color);
    }
} 

public class methods {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the person & age");
        String name=sc.nextLine();
        System.out.println("enter cat name and color");
        String Cname=sc.nextLine();
        String color=sc.nextLine();
        int age=sc.nextInt();
        owners obj1=new owners();
        obj1.person(name,age);
        obj1.cat(Cname,color);
    }
}
