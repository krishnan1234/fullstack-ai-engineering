package Day3_Standard_Iteration_Loops;
import java.util.Scanner;
public class totalDigit {
    public static void main(String[] args) {

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int digit;

        // logic
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Total Digits: " + count);
        sc.close();
    }
}

