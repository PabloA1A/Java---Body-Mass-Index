package dev.pablo;

public class BMICalculator {
    public static double calculateBMI(double weightKg, double heightM) {
        if (heightM <= 0 || weightKg <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values");
        }
        return weightKg / (heightM * heightM);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 16) {
            return "Severe thinness";
        } else if (bmi < 17) {
            return "Moderate thinness";
        } else if (bmi < 18.5) {
            return "Mild thinness";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Mild obesity";
        } else if (bmi < 40) {
            return "Moderate obesity";
        } else {
            return "Morbid obesity";
        }
    }
}