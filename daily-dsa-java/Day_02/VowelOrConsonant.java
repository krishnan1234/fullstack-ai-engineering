package Day2_Conditional_logic_and_decision;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args){

        // get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        String alphabet = sc.next();


        // logic
        switch (alphabet.toUpperCase()) {
            case "A", "E", "I", "O", "U" -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
            sc.close();

        }

    }

