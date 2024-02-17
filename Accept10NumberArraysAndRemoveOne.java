import java.util.Scanner;

class RemoveOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array of 10 numbers
        int[] numbers = new int[10];

        // Accept input for the array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Accept the number to remove
        System.out.print("Enter the number to remove: ");
        int numberToRemove = scanner.nextInt();

        // Remove occurrences of the given number
        int newSize = removeOccurrences(numbers, numberToRemove);

        // Display the updated array
        System.out.println("Array after removing occurrences of " + numberToRemove + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }

    // Function to remove occurrences of a given number from the array
    private static int removeOccurrences(int[] array, int target) {
        int newSize = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                array[newSize] = array[i];
                newSize++;
            }
        }

        return newSize;
    }
}
