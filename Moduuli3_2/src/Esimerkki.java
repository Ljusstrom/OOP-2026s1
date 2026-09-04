public abstract class Esimerkki {
    public abstract void eat();

    public static void main(String[] args) {
        Toteutus e = new Toteutus();
        e.eat();
    }
}

class Toteutus extends Esimerkki { // Toteuttaa abstraktin metodin
    public void eat() {
        System.out.println("Syömään!");
    }
}

