/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Conditional_Statements;

import java.util.Scanner;

public class Concept5 {
    public static void main(String[] args) {
        /////////////// ternery operator ///////////////
        /* The ternary operator is a shorthand way of writing an if-else statement. It takes three operands: a condition, a value to return 
        if the condition is true, and a value to return if the condition is false. */
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter age = ");
            int age = sc.nextInt();

            String result = age >= 18 ? "adult" : "underage";

            System.out.println(result);
        }
    }
}
