import java.util.Arrays;
import java.util.List;
public class DeclarativeDemo {
    public static void main(String[] args) {
        final List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);

        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 != 0)
                        .mapToInt(e -> e / 2)
                        .max()
                        .orElse(Integer.MIN_VALUE));
    }
}