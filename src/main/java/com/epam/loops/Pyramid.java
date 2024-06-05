package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int i = 1; i <= cathetusLength; i++) { // loop times (mast)
                // Print leading left spaces
                for (int j = 0; j < cathetusLength - i; j++) {
                    System.out.print(" ");
                }
                // Print left side of numbers
                for (int j = i; j > 1; j--) {
                    System.out.print(j);
                }
                // Print middle and right side of numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Print trailing right spaces
                for (int j = 0; j < cathetusLength - i; j++) {
                    System.out.print(" ");
                }
                // Move to the next line
                System.out.println();
            }
        } else {
            System.out.println("Wrong input");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
