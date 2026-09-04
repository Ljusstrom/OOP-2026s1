package paketti;

public class Luokka {
    private int tieto; // positiivinen kokonaisluku, syystä X

    public Luokka() {
        tieto = 1;
    }

    public int getTieto() { return tieto; }
    public void setTieto(int tieto) {
        if (tieto >= 0) {
            this.tieto = tieto;
        } else {
            System.out.println("Virhe! tieto ei saa olla negatiivinen!");
        }
    }

}
