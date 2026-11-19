package Loops;

public class Concept5 {
    public static void main(String[] args) {
        /////////////// enhanced for loop ///////////////
        /* The enhanced for loop, also known as the "for-each" loop, is used to iterate over elements in an array or a collection. 
        It simplifies the syntax and eliminates the need for an index variable. */

        int[] numbers = {1, 2, 3, 4, 5};

        for(int num : numbers){
            System.out.println("Number: " + num);
        }
    }
}
