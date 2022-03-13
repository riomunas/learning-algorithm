package org.abuaisyah;

import java.util.Random;

public class Util {
    public static void printArrayToTextWithIndex(int[] array) {
        System.out.println(arrayToTextmode(array, true));
    }

    public static void printArrayToText(int[] array) {
        System.out.println(arrayToTextmode(array, false));
    }
    private static String arrayToTextmode(int[] array, boolean isUsingIndex) {
        String stringArr = "";
        String stringIndex = "";
        for (int i = 0; i < array.length; i++) {
            stringArr = stringArr + (i==0?"|":"") + String.format("% 4d |", array[i]);
            stringIndex = stringIndex + (i==0?"|":"") + String.format("% 4d |", i);
        }
        String stringRow = "";
        for (int i = 0; i < stringArr.length(); i++) {
            if (stringArr.substring(i,i+1).equals("|")) {
                stringRow += "+";
            } else {
                stringRow += "-";
            }
        }

        String result = "";
        result += stringRow+"\n";
        if (isUsingIndex) {
            result += stringIndex+"\n";
            result += stringRow+"\n";
        }
        result += stringArr+"\n";
        result += stringRow;
        return result;
    }

    public static int[] generateArrayRandomInt(int lengthOfArray) {
        Random random = new Random();
        int[] numbers = new int[lengthOfArray];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt((10*lengthOfArray));
        }
        return numbers;
    }
}
