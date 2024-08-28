class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result;

        try {
            if (b == 0) {
                throw new DivisionByZeroException("Division by zero error!");
            }
            result = a / b;
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
