interface Stud_Emp{
    public void student(String s_name,String s_branch);
    public void employee(String e_name,String e_id);
}
public class interface_anonomous {
    public static void main(String[] args) {
        Stud_Emp obj=new Stud_Emp() {
            public void student(String s_name,String s_branch){
                System.out.println("student name is :"+s_name+" student branch is :"+s_branch);
            }
            public void employee(String e_name,String e_id){
                System.out.println("employee name is :"+e_name+" employee id is :"+e_id);
            }
        };
        obj.student("Ishq","AI/ML");
        obj.employee("Kafeel","100");
    }
}
