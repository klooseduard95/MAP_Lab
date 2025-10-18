import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigNumberArithmetic {

    public static List<Integer> add(int[] num1, int[] num2) {
        if (num1.length != num2.length) {
            throw new IllegalArgumentException("Arrays must have the same length for addition.");
        }

        List<Integer> resultList = new ArrayList<>();
        int length = num1.length;
        int carry = 0;

        for (int i = length - 1; i >= 0; i--) {
            int digitSum = num1[i] + num2[i] + carry;
            int resultDigit = digitSum % 10;
            resultList.add(resultDigit);
            carry = digitSum / 10;
        }

        if (carry > 0) {
            resultList.add(carry);
        }

        Collections.reverse(resultList);
        return resultList;
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

}
