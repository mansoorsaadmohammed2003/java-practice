interface Add {
    void add(int a,int b);
    // void sub(int a,int b);
    // void mult(int a , int b);

}
// class B implements Add{
//     public void add(int a,int b){
//         System.out.println("Add "+(a+b));
//     }
//     public void sub(int a,int b){
//         System.out.println("SUB "+(a-b));
//     }
//     public void mult(int a,int b){
//         System.out.println("MULT "+(a*b));
//     }
// }
interface Sub {
    void sub(int a , int b);
}

interface Mult {
    void mult(int a ,int b);
}
public class lamda_functions1 {
    public static void main(String[] args) {
        //BY USIBNG NORMAL CLASS
        // Add obj=new B();
        // obj.add(2,3);
        // obj.sub(9,7);
        // obj.mult(3, 02);
        
        //BY USING ANONOMOUS CLASS
        // A obj=new A() {
        //     public void demo(int a){
        //         System.out.println("Hello World "+a);
        //     }
        // };
        // obj.demo(5);


        //BY USING LAMDA (INNER CLASS)
        Add addobj=(a,b) -> System.out.println("Addition is : "+a+b);
        addobj.add(5,5);

        Sub Subobj=(a,b) -> System.out.println("Subtraction is : "+(a-b));
        Subobj.sub(5, 4);

        Mult multobj=(a,b) -> System.out.println("Multiplication is : "+a*b);
        multobj.mult(2, 02);
    }
}
