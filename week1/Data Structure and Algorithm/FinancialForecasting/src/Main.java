public class Main{

    //Recursion is a programming technique where a method calls itself to solve smaller instances of the same problem.
    //Simplifies complex problems (like tree traversal, Fibonacci series, etc.)

    public static double calculateFutureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + rate) * calculateFutureValue(presentValue, rate, years - 1);
    }
    public static void main(String[] args) {
        double pv = 10000;
        double rate = 0.07;
        int years = 10;

        // Simple recursion
        double fv1 = calculateFutureValue(pv, rate, years);
        System.out.printf("Future Value : %.2f%n", fv1);
    }
}

    //the time complexity of recursion is O(n).
    //we can also bound recursion to find the more optimized solution;