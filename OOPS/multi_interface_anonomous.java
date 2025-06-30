interface Student{
    public void student(String s_name,String s_branch);
}
interface Employee{
    public void employee(String e_name,String e_branch);
}
public class multi_interface_anonomous {
    public static void main(String[] args) {
        Student obj=new Student() {
            public void student(String s_name,String s_branch){
                System.out.println("student name is "+s_name+" student branch is : "+s_branch);
            }
        };
        Employee obj1=new Employee() {
            public void employee(String e_name,String e_branch){
                System.out.println("employee name is "+e_name+" employee branch is : "+e_branch);
            }
        };
        obj.student("Ishq","Aiml");
        obj1.employee("Kafeel","I.T");
    }
}
