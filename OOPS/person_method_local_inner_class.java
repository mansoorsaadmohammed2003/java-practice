class Person {
    String name;
    int age;

    public void personMethod() {
        class NameAge {
            public void personDetails() {
                System.out.println("Name of the person is: " + name + ", Age of the person is: " + age);
            }
        }
        NameAge obj1 = new NameAge();
        obj1.personDetails();
    }
}

class Dog {
    String name;
    String color;

    public void dogMethod() {
        class DogNameColor {
            public void dogDetails() {
                System.out.println("Name of the dog is: " + name + ", Color of the dog is: " + color);
            }
        }
        DogNameColor obj2 = new DogNameColor();
        obj2.dogDetails();
    }
}
public class person_method_local_inner_class  { 
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;
        person.personMethod();

        Dog dog = new Dog();
        dog.name = "Bruno";
        dog.color = "Brown";
        dog.dogMethod();
    }
}