public class TryCatchExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result;

        try {
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero!");
        }
    }
}
