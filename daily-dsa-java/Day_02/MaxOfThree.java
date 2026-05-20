package Day2_Conditional_logic_and_decision;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int Firstnumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int Secondnumber = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int Thirdnumber = sc.nextInt();

        // logic
        if(Firstnumber == 0 && Secondnumber == 0 && Thirdnumber == 0 ){
            System.out.println("Try Again!");
        }else if(Firstnumber > Secondnumber && Firstnumber > Thirdnumber){
            System.out.println("First Number is Greater!");
        }else if(Secondnumber > Firstnumber && Secondnumber > Thirdnumber){
            System.out.println("Second Number is Greater!");
        }else{
            System.out.println("Third Number is Greater!");
        }
        sc.close();
    }
}
