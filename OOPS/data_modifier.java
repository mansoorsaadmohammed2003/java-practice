class Student{
    private int id=908070;
    public String name="ShanthKumar";


    void display_details(){
        System.out.println("name : "+name+"\n id : "+id);
    }
}
public class data_modifier {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.display_details();
    }
}
