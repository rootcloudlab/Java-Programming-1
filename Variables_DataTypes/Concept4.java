/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 02 [Topic - Variables , Data types + input/output]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Variables_DataTypes;
import java.util.Scanner;
public class Concept4 {
    public static void main(String[] args) {
        //////////// topic - 04 [Input] //////////////
        /// Java provides a way to take input from the user using the Scanner class. Here is an example of how to take input in Java:
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name = ");
                String name = sc.nextLine();
                System.out.print("Enter Number = ");
                int num = sc.nextInt();

                System.out.println();

                System.out.println("your name is = "+name);
                System.out.println("you entered = "+num);
        }
    }
}
