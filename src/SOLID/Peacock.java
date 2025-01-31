package SOLID;

public class Peacock extends Bird implements Dancer {
    @Override
    public void eat() {
        System.out.println("This is Peacock's eat mechanism");
    }

    @Override
    public void sleep() {
        System.out.println("Peacock sleeps");
    }

    @Override
    public void Dance() {
        System.out.println("Peacock can dance");
    }
}
