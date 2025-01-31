package SOLID;

public class Owl extends Bird {
    @Override
    public void eat() {
        System.out.println("This is Owl's eat mechanism");
    }

    @Override
    public void sleep() {
        System.out.println("Owl sleeps");
    }
}
