class dog{
    String name;
    String color;
    int age;
    dog(String name){//,String color,int age
        this.name=name;
        // this.color=color;
        // this.age=age;
    }
    void dog_details(){
        System.out.println("name of the dog is : "+name);
    }
}
class baby_dog extends dog{

    String color;
    int age;
    baby_dog(String name , String color,int age){//,String color,int age
        super(name);
        this.color=color;
        this.age=age;
    }
    void baby_dog_details(){
        System.out.println("name of the dog is : "+name+" color of the dog is : "+color+" and the age is : "+age);
    }
}
public class dog_single_inheritence {
        public static void main(String[] args) {
        dog obj1=new dog("Tommy\n");
        baby_dog obj2=new baby_dog("Rocky\n","White\n", 2);
        obj1.dog_details();
        obj2.dog_details();
        obj2.baby_dog_details(); 
    }
}
