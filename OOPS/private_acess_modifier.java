class abc{
    private int a=10;

    private void password(){
        System.out.println(a);
    }
    void acces_private(){//default acces modifier
        password();
    }
}
public class private_acess_modifier {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.acces_private();
    }
}
