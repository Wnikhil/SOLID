package SOLID;

public class Penguine extends Bird implements Dancer {
    @Override
    public void eat() {
        System.out.println("This is Penguin's eat mechanism");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleeps");
    }

    @Override
    public void Dance() {
        System.out.println("Penguin can dance");
    }
}
