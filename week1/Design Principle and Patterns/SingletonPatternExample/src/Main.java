
public class Main {
    public static void main(String[] args) {
        // Getting Logger instance
        logger logger1 = logger.getInstance();
        logger1.log("First log message");

        // Getting Logger instance again
        logger logger2 = logger.getInstance();
        logger2.log("Second log message");

        // Verifying both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works!).");
        } else {
            System.out.println("Logger instances are different (Singleton failed!).");
        }
    }
}