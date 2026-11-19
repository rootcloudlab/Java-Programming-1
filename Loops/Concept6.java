package Loops;

public class Concept6 {
    public static void main(String[] args) {
        /////////////// break statement ///////////////
        /* The break statement is used to exit a loop prematurely, regardless of the loop's condition. 
        It is often used in conjunction with conditional statements to terminate the loop when a specific condition is met. */

        for(int i = 1; i <= 10; i++){
            if(i == 5){
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println("Hello World! " + i);
        }
    }
}
