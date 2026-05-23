package Day4_Complex_Loop_Logic;
import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {

        //get input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int digit;

        //logic

        // 1.Reverse the number
        while(num > 0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // compare orginal and reverse
        if(original == reverse){
            System.out.println("Given Number is Palindrome!");
        }else{
            System.out.println("Given Number is Not a Palindrome");
        }
        sc.close();
    }

}
