package Day3_Standard_Iteration_Loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Multiplication table for any number as your need: ");
        int num = sc.nextInt();
        int result = 1;

        // logic
        for(int i = 1; i <= 10; i++){
            result = num * i;
            System.out.println(num + " " + "x" + " " + i + " " + "=" + " " + result);
        }
        sc.close();
    }
}
