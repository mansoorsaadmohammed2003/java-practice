class outer_class{                                      //outer class
    public void method(){                                 //outer method
        class inner_class{                                 //inner class
            public void inner_method(){                     //inner method
                System.out.println("Able to Acess the inner classes method");//ability to create a class inside a class is called method_local_inner_class
            }
        }
        inner_class obj1=new inner_class();               //inner method call
        obj1.inner_method();                            //Method call for inner class
    }
}
public class method_local_inner_class {
    public static void main(String[] args) {
        outer_class obj=new outer_class();                 //poter method call
        obj.method();
    }
}
