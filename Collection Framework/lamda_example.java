interface Person {
    void person(String name,int age , String address);
}
// class A implements Person{
//     public void person(String name,int age , String address){
//         System.out.println("person name is : "+name+" age is : "+age+" adress is :"+address);
//     }
// }
public class lamda_example {
    public static void main(String[] args) {
        //BY USIBNG NORMAL CLASS
        // Person obj=new A();
        // obj.person("Saad", 20, "Banglore");
        
        //BY USING ANONOMOUS CLASS
        // Person obj=new Person() {
        //     public void person(String name,int age , String address){
        // System.out.println("person name is : "+name+" age is : "+age+" adress is :"+address);
        //     }
        // };
        // obj.person("Ishq", 22, "Kolar");


        // //BY USING LAMDA (INNER CLASS)
        Person obj1=(name,age,address) -> System.out.println("person name is : "+name+" age is : "+age+" adress is :"+address);
        obj1.person("Aftab", 21, "Baglur");
    }
}
