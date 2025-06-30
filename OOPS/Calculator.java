public class Calculator {
    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
        public int subtract(int a, int b) {
            return a - b;
        }
        public int multiply(int a, int b) {
            return a * b;
        }
        public int divide(int a, int b) {
            return a / b;
        }
    }
    public static void main(String[] args) {
        Calculator.Arithmetic calc = new Calculator.Arithmetic();
        int num1 = 20;
        int num2 = 10;
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}