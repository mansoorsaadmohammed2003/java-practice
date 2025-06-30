abstract class hello{//THIS IS AN ABSTRACT CLASS
    
    abstract void greet();//THIS IS AN ABSTARCT METHOD

}
class hi extends hello{
    void greet(){//HI TAKES ALL THE ABSTARACT PARAMETRES/PROPERTIES AND OVERIREDS IT
        System.out.println("Hello World");
    }
}
public class abstraction {
    public static void main(String[] args) {
        hi obj1=new hi();
        obj1.greet();
    }
}
