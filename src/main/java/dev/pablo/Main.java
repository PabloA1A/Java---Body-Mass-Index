package dev.pablo;

public class Main {
    public static void main(String[] args) {
        double weight = 70;
        double height = 1.82;

        double bmi = BMICalculator.calculateBMI(weight, height);
        String interpretation = BMICalculator.interpretBMI(bmi);

        System.out.printf("For a weight of %.2f kg and height of %.2f m:%n", weight, height);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.printf("Interpretation: %s%n", interpretation);
    }
}