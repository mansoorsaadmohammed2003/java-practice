class adc{
    protected void details(){
        System.out.println("Hello");
    }
}
public class protected_acess_modifier {
    public static void main(String[] args) {
        adc obj=new adc();
        obj.details();
        abc obj1=new abc();
        obj1.acces_private();
    }
    
}
