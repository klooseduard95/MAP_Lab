import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] sampleGrades = {29, 37, 38, 41, 84, 67};

        System.out.println("Beispielnoten (Sample Grades): " + Arrays.toString(sampleGrades));
        System.out.println("----------------------------------------");

        // 1. Nicht ausreichende Noten (Failing Grades)
        List<Integer> failingGrades = GradingSystem.getFailingGrades(sampleGrades);
        System.out.println("1. Nicht ausreichende Noten: " + failingGrades);

        // 2. Durchschnittswert (Average Grade)
        double averageGrade = GradingSystem.CalculateAverageGrade(sampleGrades);
        System.out.println("2. Durchschnittswert: " + averageGrade);

        // 3. Abgerundete Noten (Rounded Grades)
        List<Integer> roundedGrades = GradingSystem.getRoundedGrades(sampleGrades);
        System.out.println("3. Abgerundete Noten: " + roundedGrades);

        // 4. Maximale abgerundete Note (Max Rounded Grade)
        int maxRoundedGrade = GradingSystem.getMaxRoundedGrade(sampleGrades);
        System.out.println("4. Maximale abgerundete Note: " + maxRoundedGrade);
    }
}