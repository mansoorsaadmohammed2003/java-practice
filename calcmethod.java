import java.util.Scanner;

class Calci {
    public int add(int a, int b) {
        return a + b;
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void mult(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Denominator should not be zero");
        }
    }

    public void modulo(int a, int b) {
        if (b != 0) {
            System.out.println("Modulo: " + (a % b));
        } else {
            System.out.println("Denominator should not be zero");
        }
    }
}

public class calcmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();

        System.out.println("Enter b value:");
        int b = sc.nextInt();

        Calci calculator = new Calci();
        System.out.println("Addition: " + calculator.add(a, b));
        calculator.sub(a, b);
        calculator.mult(a, b);
        calculator.div(a, b);
        calculator.modulo(a, b);

        sc.close();
    }
}