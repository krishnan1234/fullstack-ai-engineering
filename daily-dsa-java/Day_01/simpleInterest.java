package Day1_Variables_Fundamental_Arithmetic;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args){

        // Getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the Rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter the Time: ");
        float time = sc.nextFloat();

        //calculation
        float Simpleinterest = (principal * rate * time)/100;
        System.out.println("SI = " + Simpleinterest);


    }

}
