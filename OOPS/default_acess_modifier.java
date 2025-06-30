class def{
    void default_access(){
        System.out.println("default");
        return;
    }
}
public class default_acess_modifier {
public static void main(String[] args) {
    def obj=new def();
    obj.default_access();
}
    
}
