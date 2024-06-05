package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number < 1000 || number > 9999) {
            System.out.println("Input must be 4-digit number.");
        } else {
            System.out.println(number / 1000 + number / 100 % 10 + number / 10 % 10 + number % 10);
        }
    }
}
