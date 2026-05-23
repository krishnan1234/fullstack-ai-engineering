package Day4_Complex_Loop_Logic;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int original = num; // Save the original value
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            // Calculate cube manually since ^ is XOR in Java
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        // Compare sum against the saved original value
        if(sum == original){
            System.out.println(original + " is an Armstrong Number!");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
        sc.close();
    }
}