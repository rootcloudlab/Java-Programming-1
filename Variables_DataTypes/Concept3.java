/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 02 [Topic - Variables , Data types + input/output]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Variables_DataTypes;

//////////// topic - 03 [Mathametical Calculation in java] ////////////
/* Java provides a set of arithmetic operators that can be used to perform mathematical calculations. 
    Here are some examples of mathematical calculations in Java: */

public class Concept3{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = 15;
        int c = a + b; // addition
        int d = b - a; // subtraction
        int e = a * b; // multiplication
        int f = b / a; // division
        int g = b % a; // modulus
        int div = x/a; // division with different variable
        double div2 = (double) x/a; // division with different variable

        System.out.println("Addition: " + c);
        System.out.println("Subtraction: " + d);
        System.out.println("Multiplication: " + e);
        System.out.println("Division: " + f);
        System.out.println("Modulus: " + g);
        System.out.println("Division with different variable: " + div);
        System.out.println("Division with different variable (double): " + div2);
    }
}
