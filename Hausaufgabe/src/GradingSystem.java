import java.util.ArrayList;
import java.util.List;

public class GradingSystem {

    private static int roundUp(int grade) {

        final int MIN_ROUNDING_GRADE = 38;
        if (grade < MIN_ROUNDING_GRADE) {
            return grade;
        }

        int remainder = grade % 5;
        int nextMultipleOf5;

        if (remainder == 0) {
            nextMultipleOf5 = grade;
        } else {
            nextMultipleOf5 = grade + (5- remainder);
        }

        int difference = nextMultipleOf5 - grade;

        final int MAX_DIFFERENCE_FOR_ROUNDING = 3;
        if (difference < MAX_DIFFERENCE_FOR_ROUNDING) {
            return nextMultipleOf5;
        } else {
            return grade;
        }
    }

    public static List<Integer> getFailingGrades(int[] grades) {
        final int FAILING_THRESHOLD = 40;
        List<Integer> failingGradesList = new ArrayList<>();

        for (int grade: grades) {
            if (grade < FAILING_THRESHOLD) {
                failingGradesList.add(grade);
            }
        }

        return failingGradesList;
    }
}
