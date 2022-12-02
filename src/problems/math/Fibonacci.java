package problems.math;

import java.util.Scanner;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */

    public static void main(String[] args) {
        int rem , a=0 , b= 1, c ;
        System.out.println("enter number");
        Scanner sw= new Scanner(System.in);
        rem = sw.nextInt();
        for (int i = 0; i <= rem; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }


    }
}
