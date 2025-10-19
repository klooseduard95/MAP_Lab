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

    private static int findMaximum(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxPrice = prices[0];
        for (int i = 1; i <= prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        return maxPrice;
    }

    public static int findMostExpensiveItem(int[] keyboardPrices, int[] usbPrices) {
        int maxKeyboard = findMaximum(keyboardPrices);
        int maxUsb = findMaximum(usbPrices);

        if (maxKeyboard > maxUsb) {
            return  maxKeyboard;
        } else {
            return maxUsb;
        }
    }

    public static int findMostExpensiveBuyableUsb(int[] usbPrices, int budget) {
        int maxBuyablePrice = -1;
        for (int price : usbPrices) {
            if (price <= budget && price > maxBuyablePrice) {
                maxBuyablePrice = price;
            }
        }

        return maxBuyablePrice;
    }

    public static int findMaxExpenditure(int budget, int[] keyboardPrices, int[] usbPrices) {
        int maxSpent = -1;

        for (int keyboardPrice : keyboardPrices) {
            for (int usbPrice : usbPrices) {
                int currentTotal = keyboardPrice + usbPrice;

                if (currentTotal <= budget) {
                    if (currentTotal > maxSpent) {
                        maxSpent = currentTotal;
                    }
                }
            }
        }
        return maxSpent;
    }

}
