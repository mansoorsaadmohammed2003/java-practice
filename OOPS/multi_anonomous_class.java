abstract class student{
    abstract void Student(String s_name,String s_branch);
}
abstract class employee{
    abstract void Employee(String e_name,String e_role);
}
public class multi_anonomous_class {
    public static void main(String[] args) {
        student obj1=new student() {
            void Student(String s_name,String s_branch){
                System.out.println("student name is : "+s_name+" student branch is : "+s_branch);
            }
        };
        employee obj2=new employee() {
            void Employee(String e_name,String e_role){
                System.out.println("employee name is : "+e_name+" emp role is : "+e_role);
            }
        };
        obj1.Student("Ishq","AI/ML");
        obj2.Employee("Kafeel", "21");
    }
}
