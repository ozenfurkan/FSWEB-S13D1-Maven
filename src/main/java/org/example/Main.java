package org.example;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock > 23 || clock < 0) {
            return false;
        } else {
            return isBarking && (clock > 20 || clock < 8);
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] ages = {firstAge, secondAge, thirdAge};

        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }

        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if (width <= 0 || height <= 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static double area(double radius) {
        if (radius <= 0) {
            return -1;
        } else {
            return radius * radius * PI;
        }
    }
}
