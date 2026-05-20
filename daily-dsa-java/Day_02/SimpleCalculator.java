package Day2_Conditional_logic_and_decision;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        //Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, Start Your Calculation!");
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operation: ");
        String operation = sc.next();
        int result;

        //Logic
        switch(operation){
            case "+":
                result = num1 + num2;
                System.out.println("Result = " + num1 + " " + "+" + " " + num2 + " " + "=" + " "+ result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Result = " + num1 + " " + "-" + " " + num2 + " " + "=" + " "+ result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result = " + num1 + " " + "*" + " " + num2 + " " + "=" + " "+ result);
                break;

            case "/":
                if(num2 == 0){
                    System.out.println("zero division error");
                }else{
                    result = num1 / num2;
                    System.out.println("Result = " + num1 + " " + "/" + " " + num2 + " " + "=" + " "+ result);

                }
                break;

            default:
                System.out.println("Enter the Valid Operator!");



        }
        sc.close();
    }
}

