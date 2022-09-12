package questions_from_bryan;

public class IfReview {

    public static String name; // static variable 'name' -> static means we can call/use/change it but the changes will affect the whole class (all the existing or new objects);
    static{ // static block is used to initialize the static variable. We can not use Constructor to initialize the static variables.
        name = "heyo";
    }

    public static void main(String[] args) {
        IfReview ifReview = new IfReview(); // created the new object 'ifReview';
        ifReview.name = "yoyo"; // reassigned the static variable 'name' to "yoyo", now name = "yoyo" for all the objects of the class (already existing or the ones we will create in future);

        IfReview newIfReview = new IfReview(); // created the new object 'newIfReview'; => and STILL name = "yoyo";
        newIfReview.name = "nono"; // reassigned the static variable 'name' to "nono", now name = "nono" for all the objects of the class (already existing or the ones we will create in future);

        IfReview lastIfReview = new IfReview(); // created the new object 'lastIfReview'; => and STILL name = "nono";
        System.out.println(lastIfReview.name); // print statement is calling the static variable name with the use of object; name = "nono" and it doesn't matter which object we use; Also, here we could use the ClassName to call the static variable. System.out.println(IfReview.name) => will work the same and name is still going to be "nono" until reassigned.


    }
}
