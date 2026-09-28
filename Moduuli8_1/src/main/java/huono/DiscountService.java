package huono;

import java.time.LocalDateTime;

public class DiscountService {
    public double calculateDiscountedPrice(String customerType, double price) {
        LocalDateTime now = LocalDateTime.now();

        if (price < 0) {
            System.out.println("Virheellinen hinta");
            return -1;
        }

        double discount = 0;
        if (customerType.equals("PREMIUM")) {
            discount = 0.2;
        } else if (customerType.equals("BASIC")) {
            discount = 0.1;
        }

        // Sunnuntaialennus
        if (now.getDayOfWeek().getValue() == 7) {
            discount += 0.05;
        }

        double finalPrice = price * (1 - discount);
        System.out.println("Lopullinen hinta: " + finalPrice);
        return finalPrice;
    }

    public static void main(String[] args) {
        DiscountService dis = new DiscountService();
        dis.calculateDiscountedPrice("PREMIUM", 100);
    }
}