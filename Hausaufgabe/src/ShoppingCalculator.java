public class ShoppingCalculator {

    public static int findCheapestKeyboard(int[] keyboardPrices) {
        if (keyboardPrices == null || keyboardPrices.length == 0) {
            return 0;
        }

        int minPrice = keyboardPrices[0];
        for (int i = 1; i <= keyboardPrices.length; i++) {
            if (keyboardPrices[i] < minPrice) {
                minPrice = keyboardPrices[i];
            }
        }

        return minPrice;
    }
}
