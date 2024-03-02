class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("List of Even numbers:");
        // method calling
        displayEvenNumbers(50, 100);
    }

    // method that check the number is even or not
    public static void DisplayEvenNumbers(int number, int end) {
        if (number % 2 == 0)// if the number is divisible by 2 then it's an even number
            System.out.print(number + " ");
        else
            return false;

        if (end != 0) // recursion until the value of 'end ' becomes 0
            return DisplayEvenNumbers(number + 2, end - 1);
    }

}