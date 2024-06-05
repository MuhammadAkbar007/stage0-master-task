package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint > 0) {
            for (int i = 0; i < 11; i++) {
                System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
            }
        } else {
            System.out.println("Number should be positive integer.");
        }
    }

}
