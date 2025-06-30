class college{
    String c_name;
    String c_adress;
    college(String college_name,String college_address){
        c_name=college_name;
        c_adress=college_address;
    }
    void college_details(){
        System.out.println("the college name is : "+c_name+"\n and the college address is : "+c_adress);
    }
}
class dept extends college{
    String d_name;
    String t_name;
    dept(String department_name,String college_address,String teachers_name){
        super("some_college_name", college_address);
        d_name=department_name;
        t_name=teachers_name;
    }
    void department_details(){
        System.out.println("the department name is :"+d_name+"\nthe college address is : "+c_adress+" and the teachers name is : "+t_name);
    }
}
class student extends dept{
    String s_name;
    int s_roll_no;
    student(String student_name,String department_name,String college_address,String teachers_name,int student_roll_no) {
        super(department_name, college_address, teachers_name);
        s_name=student_name;
        s_roll_no=student_roll_no;
    }
    void student_details(){
        System.out.println("the student name is :"+s_name+"\nthe teacher name is : "+t_name+"\n and the student roll number is : "+s_roll_no);
    }

}
public class college_multiple_inheritence {
    public static void main(String[] args) {
        college obj1=new college("VVIT", "Byrathi Bande\n");
        dept obj2=new dept("AI/ML","Byrathi Bande","Naveen G\n");
        student obj3=new student("Mohammed Saad Mansoor", "AI/ML", "Byrathi Bande", "Naveen G",24);
        obj1.college_details();
        obj2.department_details();
        obj3.student_details();
    }
}
