/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Conditional_Statements;

import java.util.Scanner;

public class Concept2 {
    public static void main(String[] args) {
        /////////////// if-else statement ///////////////
        /*  The if-else statement is used to execute one block of code if a specified condition is true, 
        and another block of code if the condition is false. */

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter age = ");
            int age = sc.nextInt();

            if(age >= 18){
                System.out.println("adult");
            }
            else{
                System.out.println("underage");
            }
        }
    }
}
