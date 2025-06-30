
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            try{Thread.sleep(2000);
                System.out.println("GOOD");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            try{Thread.sleep(2000);
                System.out.println("BAD");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }    
}
public class MT_interfaces {
    public static void main(String[] args) throws Exception {
        Runnable obj1=new A();
        Runnable obj2=new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        Thread.sleep(2000);
        t2.start();
    }
}