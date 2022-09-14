package group_study1;

public class SpiderMan extends Human {

     // we need an object to use setter
    // to create an object we need a Constructor

    // protected String name;


    public SpiderMan() {
        // name = null;
        setName(name = "Peter Parker");
    } // => every time we make an object of SpiderMan the name is set to Peter Parker.

    @Override
    public void talk() {
        System.out.println("SpiderMan talks like Human");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
