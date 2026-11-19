/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Conditional_Statements;

public class Concept4 {
    public static void main(String[] args) {
        /////////////// nested if statement ///////////////
        /* The nested if statement is used to test multiple conditions by placing one if statement inside another. 
        It allows you to create more complex decision-making structures by evaluating additional conditions based 
        on the outcome of the outer if statement. */

        int age = 20;
        int weight = 60;

        if(age >= 18){
            if(weight > 50){
                System.out.println("You are eligible to donate blood");
            }
            else{
                System.out.println("You are not eligible to donate blood");
            }
        }
        else{
            System.out.println("You must be at least 18 years old to donate blood");
        }
    }
}
