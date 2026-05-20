package Day2_Conditional_logic_and_decision;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        // logic
        if (num == 0){
            System.out.println("Unable to find! please change the number");
        }else if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
