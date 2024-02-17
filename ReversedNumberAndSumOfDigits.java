import java.util.Scanner;

 class ReverseAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the reverse of the number
        int reversedNumber = reverseNumber(number);
        System.out.println("Reverse of the number: " + reversedNumber);

        // Calculate and print the sum of digits
        int sumOfDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumOfDigits);

        scanner.close();
    }

    // Method to reverse a number
    private static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }

    // Method to calculate the sum of digits of a number
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
