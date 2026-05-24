package Day5_Nested_Loops_Patterns_Advanced_Math;
public class Right_Angle_Triangle_Pattern {
    public static void main(String[] args){

        // logic
        for(int i = 0; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
