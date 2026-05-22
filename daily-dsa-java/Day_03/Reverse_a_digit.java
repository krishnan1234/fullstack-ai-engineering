package Day3_Standard_Iteration_Loops;
import java.util.Scanner;
public class Reverse_a_digit {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int digit;

        // logic
        while(num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed Number: " + reverse);
        sc.close();
    }
}
