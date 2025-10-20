import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static List<Integer> substract(int[] num1, int[] num2) {
        if (num1.length != num2.length) {
            throw  new IllegalArgumentException("Arrays must have the same length for addition.");
        }

        List<Integer> resultList = new ArrayList<>();
        int length = num1.length;
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

            resultList.add(difference);
        }

        Collections.reverse(resultList);

        int firstDigitIndex = 0;
        while (resultList.size() > 1 && firstDigitIndex < resultList.size() - 1 && resultList.get(firstDigitIndex) == 0) {
            firstDigitIndex++;
        }
        return resultList.subList(firstDigitIndex, resultList.size());
    }

    public static List<Integer> multiply(int[] num1, int factor) {
        if (factor < 0 || factor > 9) {
            throw new IllegalArgumentException("Factor must be a single digit (0-9).");
        }

        if (factor == 0) {
            return List.of(0);
        }

        List<Integer> resultList = new ArrayList<>();
        int length = num1.length;
        int carry = 0;

        for (int i = length - 1; i >=0; i--) {
            int product = num1[i] * factor + carry;
            int resultDigit = product % 10;
            resultList.add(resultDigit);

            carry = product / 10;
        }

        if (carry > 0) {
            while (carry > 0) {
                resultList.add(carry % 10);
                carry /= 10;
            }
        }

        Collections.reverse(resultList);

        return resultList;
    }

    public static List<Integer> divide(int[] num1, int divisor) {
        if (divisor <=0 || divisor > 9) {
            throw new IllegalArgumentException("Divisor must be a single digit (1-9).");
        }

        List<Integer> resultList = new ArrayList<>();
        int remainder = 0;

        for (int digit : num1) {
            int currentNumber = remainder * 10 + digit;
            int quotientDigit = currentNumber / divisor;
            resultList.add(quotientDigit);

            remainder = currentNumber % divisor;
        }

        int firstDigitIndex = 0;
        while (resultList.size() > 1 && resultList.get(firstDigitIndex) == 0) {
            firstDigitIndex++;
        }

        return resultList.subList(firstDigitIndex, resultList.size());
    }

}
