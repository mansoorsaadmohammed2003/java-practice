package Multi_Threading;

class Aaa extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ishtiaq");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Bbb extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("BADA");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Ccc extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hai");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MT_Demo {
    public static void main(String[] args) throws Exception {
        Aaa obj1 = new Aaa();
        Bbb obj2 = new Bbb();
        Ccc obj3=new Ccc();
        obj1.start();           // Start thread Aaa
        Thread.sleep(1000);     // Main thread sleeps for 5 seconds
        obj2.start();           // Then start thread Bbb
        Thread.sleep(2000);
        obj3.start();
        Thread.sleep(3000);

    }
}