/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 03 [Topic - Operators and Expression]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Operators_Expression;

public class Concept2 {
    public static void main(String[] args) {
        /////////////////// increment and decrement operator ///////////////////////
        /*The increment operator (++) increases the value of a variable by 1, 
        while the decrement operator (--) decreases the value of a variable by 1. */

        int x = 20;
        int y = 25;

        x++;
        System.out.println(x); // 21
        x--;
        System.out.println(x); // 20
        --y;
        System.out.println(y); // 24
        ++y;
        System.out.println(y); // 25



        System.out.println();


        int z = 100;
        int w = 200;

        // z++
        System.out.println(z);  // 100
        System.out.println(z++); // 100
        System.out.println(z);  // 101

        // z--
        System.out.println(z); // 101
        System.out.println(z--); // 101
        System.out.println(z); // 100

        // ++w
        System.out.println(w); // 200
        System.out.println(++w); // 201
        System.out.println(w); // 201

        // --w
        System.out.println(w); // 201
        System.out.println(--w); // 200
        System.out.println(w); // 200
    }
}
