package Day4_Complex_Loop_Logic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // 1. Get the limit from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        // 2. Initialize the first two terms
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        // 3. Logic to handle and print the sequence
        for (int i = 1; i <= terms; i++) {
            // Print the current term
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;

            // The "Shuffle": Shift variables forward for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        sc.close();
    }
}