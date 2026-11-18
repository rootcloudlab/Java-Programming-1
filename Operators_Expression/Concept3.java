/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Lecture No - 03 [Topic - Operators and Expression]
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Operators_Expression;

public class Concept3 {
    public static void main(String[] args) {
        //////////// Comparision Operators ////////////
        /// Java provides a set of comparison operators that can be used to compare values and return a boolean result (true or false).
        
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


        System.out.println(a==b); // true
        System.out.println(a!=b); // false
        System.out.println(a!=a1); // true
        System.out.println(c!=d); // false
        System.out.println(c1==d1); // false
        System.out.println(b1!=e); // true
        System.out.println(e==f); // true
        System.out.println(e1==f1); // false
    }
}
