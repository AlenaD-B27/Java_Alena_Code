package group_study1;

public abstract class Human {

    protected String name;

    // we have the constructor and it is Default Constructor.
    // Default Constructor means all the variables are Default.
    // it means that name = null;

    public void setName(String name) {
        this.name = name;
    }

    // for encapsulation the variable should be always private/protected and getters and setters must be public.

    public abstract void talk();

    @Override
    public String toString() {
        return name + " has Human DNA";
    }
}
