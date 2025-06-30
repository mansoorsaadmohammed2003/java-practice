class F{//FAther of 2 sons
    void dad(){
        System.out.println("im the Father");
    }
}
class S1 extends F{//son1 elder son
    void son1(){
        System.out.println("im the elder Son 1");
    }
}
class S2 extends F{//son2 younger son
    void son2(){
        System.out.println("im the younger Son 2");
    }
}
public class demo_hierachiel_inheritence {
    public static void main(String[] args) {
        F obj1=new F();
        S1 obj2=new S1();
        S2 obj3=new S2();
        obj2.dad();//father and son1
        obj2.son1();
        obj3.dad();//father and son2
        obj3.son2();
    }
}
