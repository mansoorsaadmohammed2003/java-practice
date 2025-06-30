class student{
    void s_details(String s_name,String s_dept){//METHOD 1
        System.out.println("\nStudent name: "+s_name+" Student Dept: "+s_dept);
    }
    void s_details(String s_name,String s_usn,String s_dept){//METHOD 2
        System.out.println("\nStudent name: "+s_name+" Student USN: "+s_usn+" Student Dept: "+s_dept+"\n");
    }
}
public class student_method_overloading {
    public static void main(String[] args) {
        student obj=new student();
        obj.s_details("Ishq","AIML");//TAKING DIFF PARAMETRES
        obj.s_details("Saad","1VJ21AI130","CS");//THIS IS CALLED METHODOVERLOADING
    }
}
