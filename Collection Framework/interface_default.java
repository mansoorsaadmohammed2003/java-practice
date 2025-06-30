interface A {
    default void demo(){//WE USE DEFAULT IN INTERFACE
        System.out.println("Hello World");
    }    
}
class B implements A{
    void demo1(){
        System.out.println("Hello World");
    }
}
public class interface_default {
    public static void main(String[] args) {
        A obj=new B();
        obj.demo();
    }
}
