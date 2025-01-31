package SOLID;

public class Sparrow extends Bird {
    @Override
    public void eat() {
        System.out.println("This is Sparrow's eat mechanism");
    }

    @Override
    public void sleep() {
        System.out.println("Sparrow sleeps");
    }
}
