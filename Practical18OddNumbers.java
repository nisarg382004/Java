import java.util.Scanner;

class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = sc.nextInt();

        System.out.println("Enter the ending number:");
        int end = sc.nextInt();

        System.out.println("List of Odd numbers:");
        // method calling
        DisplayOddNumbers(start, end);

        sc.close();
    }

    // method that checks if the number is Odd or not
    public static void DisplayOddNumbers(int number, int end) {
        if (number > end)
            return;

        if (number % 2 != 0) {
            // if the number is not divisible by 2, then it's an Odd number
            System.out.print(number + " ");
        }

        // calling the method and increments the number by 2 regardless of even or odd
        DisplayOddNumbers(number + 1, end);
    }
}
