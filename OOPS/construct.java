class efg {
    String name;
    String gender;
    efg(String n,String g){
        name=n;
        gender=g;
    }
    public void details(){
        System.out.println(name+" "+gender);
    }
    
}
public class construct {
    public static void main(String[] args) {
        efg obj=new efg("Ishq", "M");
        obj.details();
    }
}
