package Day1_Variables_Fundamental_Arithmetic;
import java.util.Scanner;
public class area_and_circumference {
    public static void main(String[] args){

        //getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int radius = sc.nextInt();

        //calculating Area of circle
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = Math.PI * (2 * radius);

        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of the Circle: " + circumference);
    }

}
