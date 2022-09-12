package exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException { // throws + exception type

        /*
        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("World");
        */
        // try-catch is good for handling just 1 exception to the SAME TYPE. Otherwise you will have to create multiple try-catch blocks for each appearance of the exception.


        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");
        Thread.sleep(4000);
        System.out.println("How are you?");

    }


    public static void sleepFor5Seconds() throws InterruptedException { // method is created for someone to handle
        Thread.sleep(5000);
    }

    public static void Test(){
     //   sleepFor5Seconds(); // whoever called this method needs to handle the exception (with try-catch => after that it will be handled for all the future uses).
    }


}
