public class nestedifelse {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a >= b) {
            if (a >= c) {
                System.out.println("a is largest");
            } else {
                System.out.println("c is largest");
            }
        } else {
            if (b >= c) {
                System.out.println("b is largest");
            } else {
                System.out.println("c is largest");
            }
        }
    }
}