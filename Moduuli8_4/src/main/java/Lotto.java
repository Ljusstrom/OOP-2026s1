import java.util.Arrays;
import java.util.stream.Stream;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Lotto class to generate random lotto numbers and count matching numbers against given lotto vector using functional programming
 */
public class Lotto {
    private int[] numbers;
    private int size;
    private int range;

    public Lotto(int size, int range) {
        this.numbers = new int[size];
        this.size = size;
        this.range = range;
    }

    // generate size random numbers between 1 and range
    public void generateLottoNumbers() {
        numbers = Stream.iterate(1, n -> n + 1)
                .limit(range)
                .sorted((a, b) -> ThreadLocalRandom.current().nextInt(-1, 2))   // randomize the order
                .distinct()
                .limit(size)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // count matching numbers between the generated numbers and the given numbers
    public int countMatchingNumbers(int[] givenNumbers) {
        return (int) Arrays.stream(numbers)
                .filter(num -> Arrays.stream(givenNumbers).anyMatch(givenNum -> givenNum == num))
                .count();
    }

    // get the numbers from the stream
    public int[] getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        // Create a Lotto object with size 7 and range 40
        // The number of combinations is C(40, 7) = 18.643.560
        Lotto lotto = new Lotto(7, 40);

        // Generate random lotto numbers
        lotto.generateLottoNumbers();
        int[] generatedNumbers = lotto.getNumbers();

        // Print the generated numbers
        System.out.println("Generated Lotto Numbers: " + java.util.Arrays.toString(generatedNumbers));

        // Given numbers to compare with
        int[] givenNumbers = {1, 2, 3, 4, 5, 6, 7};

        // Count matching numbers
        int matchingCount = lotto.countMatchingNumbers(givenNumbers);

        // Print the count of matching numbers
        System.out.println("Count of Matching Numbers: " + matchingCount);
    }
}