/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Conditional_Statements;

import java.util.Scanner;

public class Concept3 {
    public static void main(String[] args) {
        ///////////////// else-if ladder ///////////////
        /* The else-if ladder is used to select one block of code to be executed from multiple conditions. 
        It allows you to test multiple conditions sequentially and execute the corresponding block of code for the first true condition. */

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter age = ");
            int age = sc.nextInt();

            if(age >= 18){
                System.out.println("adult");
            }
            else if(age >= 13 && age < 18){
                System.out.println("teenager");
            }
            else if(age >= 5 && age < 13){
                System.out.println("child");
            }
            else if(age < 0){
                System.out.println("invalid age");
            }
            else{
                System.out.println("baby");
            }
        }
    }
}
