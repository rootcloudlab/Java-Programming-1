/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 04 [Topic - Conditional Statement]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package Conditional_Statements;

public class Concept6 {
    public static void main(String[] args) {
        /////////////// switch statement ///////////////
        /* The switch statement is used to select one block of code to be executed from multiple options based on 
        the value of a variable or an expression. It provides a more concise and readable way to handle multiple 
        conditions compared to using multiple if-else statements. */

        int day = 4;

        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
