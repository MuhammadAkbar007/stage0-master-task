package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Input must be 3-digit number.");
        } else {
            System.out.println(number % 10 + "" + number / 10 % 10 + number / 100);
        }
    }
}
