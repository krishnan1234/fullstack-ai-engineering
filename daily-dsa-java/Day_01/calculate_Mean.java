package Day1_Variables_Fundamental_Arithmetic;
import java.util.Scanner;
public class calculate_Mean {
    public static void main(String[] args){

        // Getting Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark: ");
        int maths = sc.nextInt();
        System.out.println("Enter the Mark: ");
        int physics = sc.nextInt();
        System.out.println("Enter the Mark: ");
        int chemistry = sc.nextInt();

        // calculate mean
        int mean = (maths + physics + chemistry)/3;
        System.out.println("Mean= " + mean);
    }
}
