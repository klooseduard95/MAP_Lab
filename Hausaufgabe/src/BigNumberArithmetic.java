import java.util.ArrayList;
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

}
