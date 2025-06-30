class car{
    String color;
    String model;

    car(String color, String model){
        this.color=color;
        this.model=model;
    }
    void car_details(){
        System.out.println("color is : "+color+" and model is : "+model);
    }
}
class BMW extends car{
    String fuelType;
    BMW(String color, String model , String fuelTyp){
        super(color, model);
        this.fuelType=fuelTyp;
    }
    void BMW_details(){
        System.out.println("color is : "+color+" model is : "+model+" fuel type : "+fuelType);
    }
}
public class car_single_level_inheritence {
    public static void main(String[] args) {
        car obj=new car("Black", "2022");
        BMW obj1=new BMW("White", "2025", "Petrol");
        obj1.BMW_details();
    }
    
}
