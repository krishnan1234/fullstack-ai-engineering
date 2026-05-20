package Day2_Conditional_logic_and_decision;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args){
        // get input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Given number is Positive!");
        }else if(num < 0){
            System.out.println("Given number is Negative!");
        }else{
            System.out.println("Given number is Zero!");
        }
        sc.close();
    }



}
