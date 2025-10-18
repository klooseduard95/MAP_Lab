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


        int[] exampleArray = {4, 8, 3, 10, 17};

        System.out.println("Eingabe Array (Input Array): " + Arrays.toString(exampleArray));
        System.out.println("----------------------------------------");

        // 1. Maximale Zahl
        int maxNumber = ArrayAnalysis.findMaximum(exampleArray);
        System.out.println("1. Maximale Zahl: " + maxNumber);

        // 2. Minimale Zahl
        int minNumber = ArrayAnalysis.findMinimum(exampleArray);
        System.out.println("2. Minimale Zahl: " + minNumber);

        // 3. Maximale Summe von n-1 Zahlen
        long maxSum = ArrayAnalysis.findMaxSumOfNMinusOne(exampleArray);
        System.out.println("3. Maximale Summe von n-1 Zahlen: " + maxSum);

        // 4. Minimale Summe von n-1 Zahlen
        long minSum = ArrayAnalysis.findMinSumOfNMinusOne(exampleArray);
        System.out.println("4. Minimale Summe von n-1 Zahlen: " + minSum);
    }
}