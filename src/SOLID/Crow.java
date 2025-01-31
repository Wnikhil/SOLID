package SOLID;

public class Crow extends Bird implements Flyable {

    private Flyable flyingMethodA;

    Crow(Flyable flyingMethodA) {
        this.flyingMethodA = flyingMethodA;
    }

    @Override
    public void eat() {
        System.out.println("This is crow's eat mechanism");
    }

    @Override
    public void sleep() {
        System.out.println("crow sleeps");
    }

    @Override
    public void Fly() {
        this.flyingMethodA.Fly();
    }
}
