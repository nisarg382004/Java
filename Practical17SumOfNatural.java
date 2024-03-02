import java.util.*;

class SumOfNatural {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        // executes until the condition retuens true
        for (i = 1; i <= num; ++i) {
            // adding the value of i into sum variable
            sum = sum + i;
        }
        System.out.print("The sum of " + num + "Natural Numbers is : " + sum);
        sc.close();
    }
}