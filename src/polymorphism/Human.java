package polymorphism;

public abstract class Human {

    String name; // can't make it private as I need to access it in sub classes

    // for encapsulation the variable should be always private ONLY and getters and setters must be public.

    // I WANTED TO PROTECT NAME WITH ENCAPSULATION BUT I AM ALREADY TIRED AND CONFUSED, SO I DON'T KNOW HOW. IF/WHEN I FIGURE IT OUT I WILL UPDATE THE PROJECT

    // we have the constructor and it is Default Constructor.
    // Default Constructor means all the variables are Default.
    // it means that name = null;


    public void setName(String name) {
        this.name = name;
    }

    public abstract void talk();

    @Override
    public String toString() {
        return name + " Has Human DNA";
    }
}
