package exceptions;

public class TryCatch {
    public static void main(String[] args) {

       try{ // WHAT we handle
            System.out.println(9/0);
       }catch(ArithmeticException e){ // the exception type and identifier (usually e)
           // HOW we handle
           e.printStackTrace(); // .printStackTrace() method gives us the full details of the exception
           System.out.println(e.getMessage()); // .getMessage() just briefly gives you the message about WHY this exception happened
           // if(exception happens){catch block is executed}
       }finally{ // finally block is optional.
                 // finally block is ALWAYS running no matter what
           System.out.println("Finally block is always executed.");
                // the only way to stop finally block from running is to terminate the program: System.exit(0);
       }


    }
}
