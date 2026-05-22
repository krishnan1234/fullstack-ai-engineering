package Day3_Standard_Iteration_Loops;
import java.util.Scanner;
public class PowerFunction {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x: ");
        int x = sc.nextInt();
        System.out.println("Enter the number y: ");
        int y = sc.nextInt();
        int result = 1;

        //logic
        // Correct logic for Power Function
        for(int i = 1; i <= y; i++){
            result = result * x; // Multiply the running total by x each time
        }

        System.out.println(x + " raised to the power of " + y + " is: " + result);
        sc.close();


    }
}
