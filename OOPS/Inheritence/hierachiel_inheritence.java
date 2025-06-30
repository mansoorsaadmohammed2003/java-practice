class fruits{
    String season;
    fruits(String s){
        season=s;
    }
    void fruits_detail(){
        System.out.println("the season of the fruit : "+season);
    }
}
class apple extends fruits{
    String color;
    apple(String s,String c){
        super(s);
        color=c;
    }
    void apple_detail(){
        System.out.println("the season of the fruit : "+season+"\n and the color is : "+color);
    }
}
class mango extends fruits{
        double price;
    mango(String s,double price){
        super(s);
        this.price=price;
    }
    void mango_detail(){
        System.out.println("the season of the fruit : "+season+"\n and the price is : "+price);
    }
}
public class hierachiel_inheritence {
    public static void main(String[] args) {
        fruits obj1=new fruits("Winter");
        apple obj2=new apple("Summer", "Red");
        mango obj3=new mango("Rainy", 100);
        obj2.apple_detail();
        obj3.mango_detail();
    }
}
