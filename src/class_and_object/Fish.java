package class_and_object;

public class Fish {

    // class name is always PascalCase
    // we create instance variables = requirements

    boolean canSwim;
    int fins;
    String size;
    boolean eatsOtherAnimals;
    String color;

    // if we do not create constructor java will make the default one for us.
    // constructor can be: 1. default, 2. no arguments or 3. with arguments.

    public Fish(boolean abilityToSwim, int fins, String size, boolean eatsOtherAnimals, String color) {

        canSwim = abilityToSwim; // instance variable canSwim = local variable abilityToSwim;
        this.fins = fins; // this. keyword points to the instance variable
        /*
        "this.variable" is used to call the instant variable inside of a Constructor in case if the local variable with the same name already declared. this.x = x; this.x - instant, x - local. If we do not use “this.“ then our x will be considered by JVM as a local variable (because local variables are prioritized by JVM).
         */

        this.size = size;
        this.eatsOtherAnimals = eatsOtherAnimals;
        this.color = color;
    }
    // constructor is always public
    // constructor can be overloaded

    public Fish(String color){ //TODO will finish tomorrow: this() keyword needs to be explained
        this.color = color;
    }

    public Fish(){ //TODO will finish tomorrow: no argument constructor and convention of constructor order
    }

    // to create the toString method we can generate it from InteliJ.
    // Mac: command + N
    // Windows: ctrl + N


    @Override
    public String toString() {
        return "Fish{" +
                "canSwim=" + canSwim +
                ", fins=" + fins +
                ", size='" + size + '\'' +
                ", eatsOtherAnimals=" + eatsOtherAnimals +
                ", color='" + color + '\'' +
                '}';
    }
}
