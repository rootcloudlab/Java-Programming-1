/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

package Conditional_Statements;

import java.util.Scanner;

public class Concept1 {
    public static void main(String[] args) {
        //////////// if statement ////////////
        /// The if statement is used to execute a block of code if a specified condition is true.

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter age = ");
            int age = sc.nextInt();

            if(age >= 18){
                System.out.println("Adult");
            }
        }
    }
}
