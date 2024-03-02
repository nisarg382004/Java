import java.util.Scanner;

class CheckPositiveOrNegativeExample2 {
    public static void main(String[] args) {
        int num;
        // object of the Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = sc.nextInt();// reads the integer value from user and assigns it to variable 'num'

        if (num > 0)
            System.out.println("The entered number is positive.");
        else if (num < 0)
            System.out.println("The entered number is negative.");
        else
            System.out.println("The entered number is zero.");
    }
}
