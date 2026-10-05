import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Nimet {
    public static void main(String[] args) {
        List<String> nimet = Arrays.asList(
                "Kikka", "Sonya", "Matti", "Ahmed");

        nimet.stream()
                .filter(x -> x.charAt(0) != 'M')
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
