/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 05 [Topic - Loops]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Loops;

public class Concept3 {
    public static void main(String[] args) {
        /////////////// do-while loop ///////////////
        /* The do-while loop is similar to the while loop, but it guarantees that the block of code will be executed at least once, 
        regardless of whether the condition is true or false. */

        int i = 1;
        do{
            System.out.println("Hello World! " + i);
            i++;
        }while(i <= 10);
    }
}
