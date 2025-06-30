interface A {
    void demo(int a);
}
public class Lamda_functions {
    public static void main(String[] args) {
       A obj=a -> System.out.println("hello world "+a);
      // A obj= -> System.out.println(10+30+a);
       obj.demo(3); 
    }
}
