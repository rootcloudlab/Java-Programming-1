package Loops;

public class Concept4 {
    public static void main(String[] args) {
        /////////////// nested for loop ///////////////
        /* A nested for loop is a loop inside another loop. The inner loop is executed completely for each iteration of the outer loop. */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 3; j++){
                System.out.println("Outer Loop: " + i + ", Inner Loop: " + j);
            }
        }
    }
}
