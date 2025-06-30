class G{
    void grandpa(){
        System.out.println("Grandfather");
    }
}
class F extends G{
    void grandpa(){
        System.out.println("Grandfather");
    }    
    void father(){
        System.out.println("Father");
    }
}
class S extends F{
    
    void son(){
        System.out.println("Son");
    }
}
public class demo_multilevel_inheritence {
    public static void main(String[] args) {
        G obj1=new G();
        F obj2=new F();
        S obj3=new S();
        obj3.grandpa();
        obj3.father();
        obj3.son(); //this shows that in multi level inhert the son/the one whuch inherits all gets all properties from the classes they extend or inhertit
    }
}
