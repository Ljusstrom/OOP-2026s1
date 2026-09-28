package korjaus;

/**
 *  Luokka joka laskee Alennetun hinnan.
 */
public class DiscountService {

    /**
     * Eriytetty omaksi rajapinnakseen testaamisen mahdollistamiseksi.
     */
    private final TimeProvider timeProvider;

    public DiscountService(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    /** Laskee alennetun hinnan asiakastyypin ja päivämäärän perusteella.
     *
     * @param customerType Asiakastyyppi, sallittuja merkkijonoja: "PREMIUM" ja "BASIC"
     * @param price Hinta josta alennus lasketaan. Ei saa olla negatiivinen.
     * @return Palauttaa alennetun hinnan.
     */
    public double calculateDiscountedPrice(String customerType, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Hinta ei voi olla negatiivinen");
        }
        // Testataan asiakkaan tyyppi sallituksi
        if (!(customerType == "PREMIUM" || customerType == "BASIC")) {
            throw new IllegalArgumentException("Asiakastyyppi on väärä");
        }

        double discount = switch (customerType) {
            case "PREMIUM" -> 0.20;
            case "BASIC" -> 0.10;
            default -> 0.0;
        };

        if (timeProvider.now().getDayOfWeek().getValue() == 7) {
            discount += 0.05;
        }

        return price * (1 - discount);
    }
}