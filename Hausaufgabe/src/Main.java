import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sampleGrades = {29, 37, 38, 41, 84, 67};

        System.out.println("Beispielnoten (Sample Grades): " + Arrays.toString(sampleGrades));
        System.out.println("----------------------------------------");

        // 1. Nicht ausreichende Noten (Failing Grades)
        int[] failing = GradingSystem.getFailingGrades(sampleGrades);
        System.out.println("1. Nicht ausreichende Noten: " + Arrays.toString(failing));

        // 2. Durchschnittswert (Average Grade)
        double averageGrade = GradingSystem.CalculateAverageGrade(sampleGrades);
        System.out.println("2. Durchschnittswert: " + averageGrade);

        // 3. Abgerundete Noten (Rounded Grades)
        int[] rounded = GradingSystem.getRoundedGrades(sampleGrades);
        System.out.println("3. Abgerundete Noten: " + Arrays.toString(rounded));

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



        System.out.println("--- Aufgabe 3: Big Number Arithmetic (Listen-Ausgabe) ---");

        // Beispiel 1: Addition
        int[] numA_add = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] numB_add = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] sum = BigNumberArithmetic.add(numA_add, numB_add);

        System.out.println("1. Summe: " + Arrays.toString(numA_add) + " + " + Arrays.toString(numB_add) + " = " + Arrays.toString(sum));

        // Beispiel 2: Subtraktion
        int[] numA_sub = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] numB_sub = {5, 4, 0, 0, 0, 0, 0, 0, 0};

        int[] difference = BigNumberArithmetic.substract(numA_sub, numB_sub);

        System.out.println("2. Differenz: " + Arrays.toString(numA_sub) + " - " + Arrays.toString(numB_sub) + " = " + Arrays.toString(difference));

        // Beispiel 3: Multiplikation
        int[] num_mul = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int factor = 2;

        int[] product = BigNumberArithmetic.multiply(num_mul, factor);

        System.out.println("3. Multiplikation: " + Arrays.toString(num_mul) + " * " + factor + " = " + Arrays.toString(product));

        // Beispiel 4: Ganzzahlige Division
        int[] num_div = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int divisor = 2;

        int[] quotient = BigNumberArithmetic.divide(num_div, divisor);

        System.out.println("4. Ganzzahlige Division: " + Arrays.toString(num_div) + " / " + divisor + " = " + Arrays.toString(quotient));


        int[] keyboards1 = {40, 35, 70, 15, 45};
        int[] keyboards2 = {15, 20, 10, 35};
        int[] usbs1 = {20, 15, 40, 15};

        System.out.println("--- Aufgabe 4: Shopping Calculator ---");

        // 1. Billigste Tastatur
        System.out.println("1. Billigste Tastatur (Keyboards 1: [40, 35, 70, 15, 45]): " +
                ShoppingCalculator.findCheapestKeyboard(keyboards1));

        System.out.println("----------------------------------------");

        // 2. Teuerster Gegenstand insgesamt
        System.out.println("2. Teuerster Gegenstand (Keyboards 2 & USBS 1): " +
                ShoppingCalculator.findMostExpensiveItem(keyboards2, usbs1));

        System.out.println("----------------------------------------");

        // 3. Teuerstes kaufbares USB-Laufwerk
        int[] usbPrices3 = {15, 45, 20};
        int budget3 = 30;
        System.out.println("3. Teuerstes kaufbares USB (Preise: [15, 45, 20], Budget 30): " +
                ShoppingCalculator.findMostExpensiveBuyableUsb(usbPrices3, budget3));

        System.out.println("----------------------------------------");

        // 4. Maximal ausgegebener Geldbetrag
        int budget4 = 60;
        int[] keyboardsA = {40, 50, 60};
        int[] usbsA = {8, 12};
        System.out.println("4. Max Ausgabe A (B=60, KB=[40, 50, 60], USB=[8, 12]): " +
                ShoppingCalculator.findMaxExpenditure(budget4, keyboardsA, usbsA));

        int[] keyboardsB = {60};
        System.out.println("4. Max Ausgabe B (B=60, KB=[60], USB=[8, 12]): " +
                ShoppingCalculator.findMaxExpenditure(budget4, keyboardsB, usbsA));

        int[] keyboardsC = {40, 60};
        System.out.println("4. Max Ausgabe C (B=60, KB=[40, 60], USB=[8, 12]): " +
                ShoppingCalculator.findMaxExpenditure(budget4, keyboardsC, usbsA));
    }
}