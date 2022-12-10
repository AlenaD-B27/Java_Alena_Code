package null_string;

import java.sql.SQLOutput;

public class NullValues {
    public static void main(String[] args) {


        String s = null;
        String s1 = null;

      //  System.out.println(s.equals(s1)); // NullPointerException

        String s2 = new String(); // NOT NULL! It is empty and blank
        String s3 = new String();

        System.out.println(s2.equals(s3)); // true

      //  System.out.println(s.length());  // NullPointerException

        String s4 = "";
        String s5 = " ";

        System.out.println(s4.isEmpty()); //true
        System.out.println(s4.isBlank()); //true

        System.out.println(s5.isEmpty()); //false
        System.out.println(s5.isBlank()); //true




    }
}
