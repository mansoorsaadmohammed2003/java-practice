class dad_phone{
    void mobile(String phone){
        System.out.println("Nokia");
    }
}
class son_phone extends dad_phone{
    void mobile(String phone){
        System.out.println("i-Phone");//IF THERE IS NO METHOD IN PRESENT IN CHILD THEN IT TAKES THE METHOD OF SAME NAME FROM PARENT CLASS
    }
}
public class method_overiding {
    public static void main(String[] args) {
        son_phone obj1=new son_phone();//TRY TO RUN USING EMPTY SONPHONE AND IT WILL PROVIDE Dds o/p and IF U PUT METHOD OF SAME NAME TO SON THEN IT OVERIDES THE OLDER METHOD
        obj1.mobile(null);

    }
}
