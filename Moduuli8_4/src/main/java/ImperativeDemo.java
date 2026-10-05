import java.util.Arrays;
import java.util.List;
public class ImperativeDemo {
    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100);

        int largest = Integer.MIN_VALUE;
        for (Integer n : numbers) {
            if (n % 2 != 0) {
                int temp = n/2;

                if (temp > largest)
                    largest = temp;
            }
        }
        System.out.println(largest);
    }
}