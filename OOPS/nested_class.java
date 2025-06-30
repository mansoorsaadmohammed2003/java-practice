class outer{
    static class inner{
        // void calls(){
        {
            System.out.println("call of inner loop");
        } 
    }
}
public class nested_class {
    public static void main(String[] args) {
        outer.inner obj=new outer.inner();
    }

}
