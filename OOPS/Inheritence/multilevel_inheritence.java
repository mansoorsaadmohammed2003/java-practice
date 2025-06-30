class animal{
    String color;
    String type;

    animal(String c , String t){
        color=c;
        type=t;
    }
    void animal_details(){
        System.out.println("\ncolor of the animal is : "+color+" and the typy of the animal is : "+type+" \n");
    }
}
class feline extends animal{
    String family;
    feline(String c , String t,String f){
        super(c, t);
        family=f;
    }
    void animal_details(){
        System.out.println("\ncolor of the animal is : "+color+" ,the typy of the animal is : "+type+" and the family is "+family+"\n");
    }
}
class cat extends feline{
    String breed;
    cat(String c , String t,String f,String b){
        super(c, t, f);
        breed=b;
    }
    void animal_details(){
        System.out.println("\ncolor of the animal is : "+color+" ,the typy of the animal is : "+type+" , the family is : "+family + " and the breed is : "+breed+"\n");
    }
}
public class multilevel_inheritence {
    public static void main(String[] args) {
        animal obj1=new animal("White", "carnivore");
        feline obj2=new feline("Black", "omnivore", "feral cat");
        cat obj3=new cat("Tuxedo", "carnivore","house cat", "Bengal");
        obj1.animal_details();
        obj2.animal_details();
        obj3.animal_details();
    }
}
