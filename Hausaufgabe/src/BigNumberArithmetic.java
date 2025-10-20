import java.util.Arrays;

public class BigNumberArithmetic {

    public static int[] add(int[] num1, int[] num2) {
        if (num1.length != num2.length) {
            throw new IllegalArgumentException("Arrays must have the same length for addition.");
        }

        int length = num1.length;
        int[] tempResult = new int[length + 1];
        int carry = 0;

        for (int i = length - 1; i >= 0; i--) {
            int digitSum = num1[i] + num2[i] + carry;
            tempResult[i + 1] = digitSum % 10;
            carry = digitSum / 10;
        }

        tempResult[0] = carry;

        if (tempResult[0] == 0) {
            return Arrays.copyOfRange(tempResult, 1, tempResult.length);
        } else {
            return tempResult;
        }
    }

    public static int[] substract(int[] num1, int[] num2) {
        if (num1.length != num2.length) {
            throw  new IllegalArgumentException("Arrays must have the same length for addition.");
        }

        int length = num1.length;
        int[] result = new int[length];
        int borrow = 0;

        for (int i = length - 1; i >= 0; i--) {
            int digit1 = num1[i];
            int digit2 = num2[i];

            int difference = digit1 - digit2 - borrow;

            if (difference < 0 ) {
                difference += 10;
                borrow = 1;
            } else  {
                borrow = 0;
            }

            result[i] = difference;
        }


        int firstDigitIndex = 0;
        while (firstDigitIndex < length - 1 && result[firstDigitIndex] == 0) {
            firstDigitIndex++;
        }
        return Arrays.copyOfRange(result, firstDigitIndex, length);
    }

    public static int[] multiply(int[] num1, int factor) {
        if (factor < 0 || factor > 9) {
            throw new IllegalArgumentException("Factor must be a single digit (0-9).");
        }

        if (factor == 0) {
            return new int[]{0};
        }

        int length = num1.length;
        int[] tempResult = new int[length + 1];
        int carry = 0;

        for (int i = length - 1; i >=0; i--) {
            int product = num1[i] * factor + carry;
            tempResult[i + 1] = product % 10;
            carry = product / 10;
        }

        tempResult[0] = carry;

        if (tempResult[0] == 0) {
            return Arrays.copyOfRange(tempResult, 1, tempResult.length);
        } else {
            return tempResult;
        }

    }

    public static int[] divide(int[] num1, int divisor) {
        if (divisor <=0 || divisor > 9) {
            throw new IllegalArgumentException("Divisor must be a single digit (1-9).");
        }

        int length = num1.length;
        int[] result = new int[length];
        int remainder = 0;

        for (int i = 0; i < length; i++) {
            int currentNumber = remainder * 10 + num1[i];
            int quotientDigit = currentNumber / divisor;
            result[i] = quotientDigit;
            remainder = currentNumber % divisor;
        }

        int firstDigitIndex = 0;
        while (firstDigitIndex < length - 1 && result[firstDigitIndex] == 0) {
            firstDigitIndex++;
        }

        return Arrays.copyOfRange(result, firstDigitIndex, length);
    }

}
