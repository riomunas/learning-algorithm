package org.abuaisyah.mine;

import static org.abuaisyah.Util.*;

public class Mergesort {
    public static void main(String[] args) {
        int numbers[] = { 10, 8, 4, 80, 13, 1, 3, 11, -1 };

        printArrayToText(numbers);
        mergeSort(numbers);
        printArrayToText(numbers);
    }

    private static void mergeSort(int[] numbers) {
        if (numbers.length == 1) return;

        int midIndex = numbers.length/2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[numbers.length-midIndex];

        for (int i = 0; i < numbers.length; i++) {
            if (i >= midIndex)
                rightHalf[i - midIndex] = numbers[i];
            else
                leftHalf[i] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(numbers, leftHalf, rightHalf);
    }

    private static void merge(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftHalfIndex = 0;
        int rightHalfIndex = 0;
        int numbersIndex = 0;

        int leftHalfSize = leftHalf.length;
        int rightHalfSize = rightHalf.length;

        while (leftHalfIndex < leftHalfSize || rightHalfIndex < rightHalfSize ) {
            /*
            left = left[leftIndex]
            right = right[rightIndex]
            isProcessLeft = left <= right
            if (isProcessLeft)
            maka counter left, counter number
            else
            maka counter right, counter number
             */
            boolean isProcessLeft = false;
            try {
                int left = leftHalf[leftHalfIndex];
                int right = rightHalf[rightHalfIndex];
                if (left <= right)
                    isProcessLeft = true;
            } catch (Exception e) {
                if (rightHalfIndex >= rightHalfSize) {
                    isProcessLeft = true;
                }
                if (leftHalfIndex >= leftHalfSize) {
                    isProcessLeft = false;
                }
            }

            if (isProcessLeft) {
                numbers[numbersIndex] = leftHalf[leftHalfIndex];
                leftHalfIndex++;
            } else {
                numbers[numbersIndex] = rightHalf[rightHalfIndex];
                rightHalfIndex++;
            }
            numbersIndex++;
        }
    }

}
