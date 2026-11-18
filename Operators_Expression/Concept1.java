/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 03 [Topic - Operators and Expression]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Operators_Expression;

public class Concept1 {
    public static void main(String[] args) {
        //////////// Arithmetic and Assingment Operators ////////////
        /// Java provides a set of arithmetic operators that can be used to perform mathematical calculations.
        int a = 10;
        int b = 20;

        int sum = a+b; // 30
        int sub = a-b; // -10
        int multi = a*b; // 200
        int div = b/a; // 2
        int mod = b%a; // 0

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

        System.out.println();
        System.out.println();

        int x = 10;
        int y = 20;

        x += y;  // a = a+b --> 30
        System.out.println(x);
        x -= y; // a = a-b --> 10 
        System.out.println(x);
    }
}
