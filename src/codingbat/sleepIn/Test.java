package codingbat.sleepIn;

import codingbat.sleepIn.Method;

public class Test {
    public static void main(String[] args) {

        /*
        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true
         */

        Method a = new Method ();
        System.out.println(a.sleepIn(false, false));
        System.out.println(a.sleepIn(true, false));
        System.out.println(a.sleepIn(false, true));


    }
}
