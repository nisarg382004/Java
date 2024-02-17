import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the input is non-negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
