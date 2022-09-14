package polymorphism;

public class Lab1 {
    public static void main(String[] args) {

        SpiderMan peter = new SpiderMan();

        peter.talk();
        peter.makesWeb();
        System.out.println(peter);

        System.out.println("=============");

        Human peter1 = new SpiderMan(); // the object is SpiderMan but he is referenced as Human.
        peter1.talk();
        System.out.println(peter1);

        peter.name = "Not Peter";




    }
}
