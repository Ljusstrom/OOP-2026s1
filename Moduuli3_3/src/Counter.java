public class Counter {
    private static int count = 0; // static variable
    private static String merkkijono = "Hiphei!";
    private int id;

    public Counter() {
        count++; // Increment count each time a new instance is created
        id = count + 1000;
    }

    public static int getCount() {
        return count;
    }

}