abstract class Animal{
    abstract void dog(String name,String color);
    abstract void cat(String name,String color);
}
public class animal_Anonomous {
    public static void main(String[] args) {
        Animal obj=new Animal() {
        void dog(String name, String color) {
                System.out.println("Dog name: " + name + ", Dog color: " + color);
            }
            void cat(String name, String color) {
                System.out.println("Cat name: " + name + ", Cat color: " + color);
            }
        };
        obj.dog("Tommy", "White");;
        obj.cat("Tom","Brown");
    }
}
