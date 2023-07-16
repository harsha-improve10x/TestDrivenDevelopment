package FindDiscount;

public class Discount {
    public float findDiscount(int originalPrice, int discount) {
        float finalPrice = 0;
        if (originalPrice > 0) {
            finalPrice = originalPrice *discount/100;
        }
        return finalPrice;
    }
}
