package polymorphism;

public final class SpiderMan extends Human implements Spider {

    public SpiderMan() {
        setName("Peter Parker");
    }

    @Override
    public void talk() {
        System.out.println(name + " talks like Human");
    }

    @Override
    public void makesWeb() {
        System.out.println(name + " makes spiderweb like Spider");
    }


    @Override
    public String toString() {
        return super.toString() + " and Has Spider DNA";
        // Peter Parker  Has Human DNA  and Has Spider DNA
    }
}
