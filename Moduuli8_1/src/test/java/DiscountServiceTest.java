import korjaus.DiscountService;
import korjaus.TimeProvider;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiscountServiceTest {

    @Test
    void premiumCustomerGets20PercentDiscount() {
        TimeProvider timeProvider =
                new FakeTimeProvider(LocalDateTime.of(2026, 3, 18, 12, 0)); // keskiviikko

        DiscountService service = new DiscountService(timeProvider);

        double result = service.calculateDiscountedPrice("PREMIUM", 100.0);

        assertEquals(80.0, result);
    }

    @Test
    void premiumCustomerGetsSundayExtraDiscount() {
        TimeProvider timeProvider =
                new FakeTimeProvider(LocalDateTime.of(2026, 3, 22, 12, 0)); // sunnuntai

        DiscountService service = new DiscountService(timeProvider);

        double result = service.calculateDiscountedPrice("PREMIUM", 100.0);

        assertEquals(75.0, result);
    }

    @Test
    void negativePriceThrowsException() {
        TimeProvider timeProvider =
                new FakeTimeProvider(LocalDateTime.of(2026, 3, 18, 12, 0));

        DiscountService service = new DiscountService(timeProvider);

        assertThrows(IllegalArgumentException.class, () ->
                service.calculateDiscountedPrice("PREMIUM", -5.0));
    }

    @Test
    void IllegalCustomerType() {
        TimeProvider timeProvider =
                new FakeTimeProvider(LocalDateTime.of(2026, 3, 18, 12, 0));
        DiscountService service = new DiscountService(timeProvider);

        assertThrows(IllegalArgumentException.class, () ->
                service.calculateDiscountedPrice("ASIAKAS", 10));
    }
}

