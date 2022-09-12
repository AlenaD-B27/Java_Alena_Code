package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");

        // unchecked exception:
        //throw new ArithmeticException("Wrong Calculation"); // manually throwing the exception => need to create an object
        // checked exception:
        //throw new InterruptedException();

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age > 130){
            throw new InputMismatchException("Invalid age: " + age); // if exception happens age=age print will not be executed
        }
        System.out.println("age = " + age);

    }
}
