public class RecursionSum {
    
    public static void main(String[] args) {
        int number = 5; // Example number
        int factorial =sum(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Recursive method to calculate factorial
    public static int sum(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n + sum(n - 1); // Recursive case
        }
    }
}
