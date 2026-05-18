package Day1_Variables_Fundamental_Arithmetic;
import java.util.Scanner;
public class swap_var_without_thirdvar {
    public static void main(String[] args){

        //Getting Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A: ");
        int A = sc.nextInt();
        System.out.println("Enter the Value of B: ");
        int B = sc.nextInt();

        //Before Swap
        System.out.println(" ---------- Before Swap ----------");
        System.out.println("A= "+ A);
        System.out.println("B= " + B);

        //After Swap
        A = A ^ B;
        B = A ^ B;
        A = A ^ B;
        System.out.println(" ---------- After Swap ----------");
        System.out.println("A= " + A);
        System.out.println("B= " + B);

    }




}
