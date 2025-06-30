class parent{
    void parent_features(){
        System.out.println("\nfeatures of parent");
    }
}
class child extends parent{
    void child_features(){
        System.out.println("features of child\n");
    }
}
public class single_level_inheritence {
    public static void main(String[] args) {
        parent parent_obj=new parent();
        parent_obj.parent_features();
        child child_obj=new child();
        child_obj.parent_features();
        child_obj.child_features();
    }
}
