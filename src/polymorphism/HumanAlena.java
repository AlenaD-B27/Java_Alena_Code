package polymorphism;

public class HumanAlena extends Human {

    public HumanAlena() {
        setName("Alena Darazhei");
    }

    @Override
    public void talk() {
        System.out.println(name + " talks a lot");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
