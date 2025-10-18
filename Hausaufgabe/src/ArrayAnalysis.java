public class ArrayAnalysis {

    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public static int findMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int minNumber = numbers[0];

        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        return minNumber;
    }

    public static long findMaxSumOfNMinusOne(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        long totalSum = 0;
        int minimum = numbers[0];

        for (int number : numbers) {
            totalSum += number;
            if (number < minimum) {
                minimum = number;
            }
        }

        return totalSum - minimum;
    }

}
