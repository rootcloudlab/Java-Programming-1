package Loops;

import java.util.Scanner;

public class Concept7 {
    public static void main(String[] args) {
        /////////////// continue statement ///////////////
        /* The continue statement is used to skip the current iteration of a loop and move to the next iteration. 
        It is often used in conjunction with conditional statements to skip certain iterations based on a specific condition. */

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a Skipping Point = ");
            int a = sc.nextInt();
            System.out.print("Enter another Skipping Point = ");
            int b = sc.nextInt();


            for(int i = 0 ; i <= 10 ; i++){
                if(i == a){
                    System.out.println("Skipping Point of  the loop at i = " + i);
                    continue;
                }
                if(i == b){
                    System.out.println("Skipping Point of  the loop at i = " + i);
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
