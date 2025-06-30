abstract class employee{ //THIS IS AN ABSTRACT CLASS
    abstract void employee_name();//HERE U TAKE 2 ABSTACT METHODS HERE
    abstract void employee_salary();
    void employee_mood(){//A NORMAL METHOD CAN ALSO BE ADDED TO THE ABSTRACT
        System.out.println("HAPPY");
    }
}
class empl_details extends employee{
    void employee_name(){
        System.out.print("Ishq Ahmed ");
    }
    void employee_salary(){
        System.out.print("50,000,000,000,000,000 ");
    }
}
abstract class department{//THIS IS AN ABSTRACT CLASS
    abstract void dept_name();//HERE U TAKE 2 ABSTACT METHODS HERE
    abstract void dept_id();
}
class dept_details extends department{
    void dept_name(){
        System.out.print("I.T ");
    }
    void dept_id(){
        System.out.println("1011");
    }
}
public class employee_abstract {
 public static void main(String[] args) {
    empl_details obj1=new empl_details();//METHOD CALL FOR 1ST ABSTRACT
    dept_details obj2=new dept_details();//THIS IS METHOD CALL FOR 2ND ABSTRACT
    obj1.employee_name();
    obj1.employee_salary();
    obj1.employee_mood();
    obj2.dept_name();
    obj2.dept_id();
 }   
}
