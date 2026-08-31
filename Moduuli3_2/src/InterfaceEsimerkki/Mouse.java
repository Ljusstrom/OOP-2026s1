package InterfaceEsimerkki;

public class Mouse implements Animal {
    @Override
    public void eat() {
        System.out.println("Mouse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }
}
