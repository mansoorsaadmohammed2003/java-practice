abstract class A1{//abstarct class
    abstract void show();//abstact method
}
public class Anonymous {
    public static void main(String[] args) {
        A1 obj=new A1() {//directly create abstract method in main class
            void show(){
                System.out.println("Acessed the anonomous class");
            }
        };//ends with semi colon
        obj.show();
    }
}
