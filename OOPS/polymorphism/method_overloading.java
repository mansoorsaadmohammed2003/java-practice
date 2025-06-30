class abc{//method overloading means using multiple methods
    public void add(int a,int b){
        System.out.println(a+b);//mehtod 1
    }
    public void add(int a,int b,int c){ //METHOD 2
        System.out.println(a+b+c);
    }
}
public class method_overloading {
    public static void main(String[] args) {
        abc obj1=new abc();
        obj1.add(1, 02);
        obj1.add(1, 02,3);
    }
}