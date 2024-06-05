package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int i = 1; i <= cathetusLength; i++) {

                for (int j = 0; j < cathetusLength - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        } else {
            System.out.println("Wrong input");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
