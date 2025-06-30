class vehicle{
    String car_Name;
    String  model;
    String color;
    int car_price;
    vehicle(String n,String m,String car_color,int price){
        car_Name=n;
        model=m;
        color=car_color;
        car_price=price;
    }
    public void car_details(){
        System.out.println(car_Name+" "+model+" "+color+" "+car_price);
    }
    public void car_details1(){
        System.out.println(car_Name+" "+model+" "+car_price);
    }
}
public class construct1 {
    public static void main(String[] args) {
        vehicle obj=new vehicle("Toyota", "Innova"," Silver", 3000000);
        obj.car_details();
        vehicle obj1=new vehicle("Hyundai", "Tucson", null, 37000000);
        obj1.car_details1();
    }
    
}
