package Day4_Complex_Loop_Logic;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args){

        //get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();


        //Logic
        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
