package problems.math;

import java.util.Scanner;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */

    public static void main(String[] args) {

        int x;
         int fact=1;

        System.out.println("entry the number");
         Scanner answer = new Scanner(System.in);
         x = answer.nextInt();
        for (int i = 1; i <=x ; i++) {
            fact= fact* i ;
            System.out.println("factorial"+fact);

        }

    }

}
