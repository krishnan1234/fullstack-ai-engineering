package Day3_Standard_Iteration_Loops;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args){

        // get input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int limit = sc.nextInt();
        int sum = 0;

        //logic
        for(int i = 1; i <= limit; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Numbers up to the given limit: " + sum);
        sc.close();
    }
}
