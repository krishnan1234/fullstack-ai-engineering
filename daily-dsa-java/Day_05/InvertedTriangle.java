package Day5_Nested_Loops_Patterns_Advanced_Math;

public class InvertedTriangle {
    public static void main(String[] args){

        // logic
        for(int i = 0; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
