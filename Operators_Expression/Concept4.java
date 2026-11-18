/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 03 [Topic - Operators and Expression]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Operators_Expression;

public class Concept4 {
    public static void main(String[] args) {
        //////////// Logical Operators ////////////
        /// Java provides a set of logical operators that can be used to combine multiple boolean expressions and return a boolean result (true or false).

        int a = 10;
        int b = 10;
        int a1 = 30;
        int b1 = 40;

        float c = 10.90f;
        float d = 10.90f;
        float c1 = 21.45f;
        float d1 = 89.86f;

        char e = 'a';
        char f = 'a';
        char e1 = 'j';
        char f1 = 'k';


        System.out.println((a==b) && (b!=a1)); // true
        System.out.println((a1==b1) && (c==d)); // false
        System.out.println((c1>=d1) || (a1<=a)); // false
        System.out.println((e==f) && (e1!=f)); // true
        System.out.println((e1!=f1) && (e==e1)); // false
        System.out.println((c==d1) || (e==f)); // true
    }
}
