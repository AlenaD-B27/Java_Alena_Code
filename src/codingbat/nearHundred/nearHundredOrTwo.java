package codingbat.nearHundred;

import java.util.Scanner;

public class nearHundredOrTwo {
    /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
     */



    public static boolean nearHundred(int n) {
        // my pretty stupid approach:
        //return (n >= 90 && n <=110) || (n >= 190 && n <= 210)? true : false;
        // website smart approach:
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        System.out.println("Result: " + nearHundred(num));
    }



}
