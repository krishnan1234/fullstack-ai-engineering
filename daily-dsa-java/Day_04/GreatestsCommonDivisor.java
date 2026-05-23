package Day4_Complex_Loop_Logic;

import java.util.Scanner;

public class GreatestsCommonDivisor {
    public static void main(String[] args) {
        // 1. Get input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        // Preserve original values for the final output
        int originalN1 = n1;
        int originalN2 = n2;

        // 2. Logic: Euclidean Algorithm (Subtraction Method)
        // We continue subtracting the smaller number from the larger one
        // until both numbers become equal.
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }

        // 3. Output the result
        // When the loop ends, n1 and n2 are equal, representing the GCD.
        System.out.println("The GCD of " + originalN1 + " and " + originalN2 + " is: " + n1);

        sc.close();
    }
}