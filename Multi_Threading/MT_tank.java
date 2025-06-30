class Aaa implements Runnable {
    int i = 0;

    public void run() {
        while (i <= 100) {
            if (i == 10) {
                System.out.println("10% has been filled");
            } else if (i == 20) {
                System.out.println("20% has been filled");
            } else if (i == 30) {
                System.out.println("30% has been filled");
            } else if (i == 40) {
                System.out.println("40% has been filled");
            } else if (i == 50) {
                System.out.println("50% has been filled");
            } else if (i == 60) {
                System.out.println("60% has been filled");
            } else if (i == 70) {
                System.out.println("70% has been filled");
            } else if (i == 80) {
                System.out.println("80% has been filled");
            } else if (i == 90) {
                System.out.println("90% has been filled");
            } else if (i == 100) {
                System.out.println("100% has been filled");
            }

            try {
                Thread.sleep(2000); // simulate time delay
            } catch (Exception e) {
                System.out.println(e);
            }

            i += 10;
        }
    }
}

public class MT_tank {
    public static void main(String[] args) {
        Runnable obj1 = new Aaa();
        Thread t1 = new Thread(obj1);
        t1.start(); // start the thread
    }
}