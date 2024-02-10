public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        try {
            // Simulating an arithmetic exception
            int result = divideByZero();

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException Message: " + e.getMessage());

            System.out.println("\nPrinting Stack Trace:");
            e.printStackTrace();

            System.out.println("\nString Representation of the Exception:");
            System.out.println(e.toString());

        }
    }
    

    private static int divideByZero() {
        return 5 / 0; // This will throw an ArithmeticException
    }
}

