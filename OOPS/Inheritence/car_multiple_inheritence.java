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
class AUDI extends car{
    String fuelType;
    AUDI(String color, String model , String fuelTyp){
        super(color, model);
        this.fuelType=fuelTyp;
    }
    void AUDI_details(){
        System.out.println("color is : "+color+" model is : "+model+" fuel type : "+fuelType);
    }
}
public class car_multiple_inheritence {
    public static void main(String[] args) {
        car obj=new car("Black", "2022");
        BMW obj1=new BMW("White\n", "2023\n", "Petrol\n");
        obj1.BMW_details();
        AUDI obj2=new AUDI("Silver\n","2025\n", "Diesel\n");
        obj2.AUDI_details();
    }
}
