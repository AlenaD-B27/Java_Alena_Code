package polymorphism;

public class Batman extends Human implements Bat{

    public Batman() {
        setName("Bruce Wayne");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies like Bat");
    }

    @Override
    public void talk() {
        System.out.println(name + " talks like Human");

    }

    @Override
    public String toString() {
        return super.toString() + " and Has Bat DNA";
    }
}
