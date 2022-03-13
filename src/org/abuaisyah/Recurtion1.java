package org.abuaisyah;

public class Recurtion1 {
    public static void main(String[] args) {
        sayHi(3);

        System.out.println(triangularNumber(5));

        System.out.println(factorialOf(3));
    }

    private static int factorialOf(int number) {
        //base case
        if (number == 0) {
            System.out.println(1);
            return 1;
        } else {
            int result = number * factorialOf(number - 1);
            System.out.println(number);
            return result;
        }
    }

    private static int triangularNumber(int row) {
//        printStart(row);
        //base case
        if (row == 0) {
            return row;
        } else {
            int count = row + triangularNumber(row - 1);
            printStart(row);
            return count;
        }
    }

    private static void printStart(int row) {
        String stars = "";
        for (int i = 0; i < row; i++) {
            stars = stars+"* ";
        }
        System.out.println(stars);
    }

    private static void sayHi(int counter) {
        //base case
        if (counter == 0) {
            return;
        }
        System.out.println("Hi");
        sayHi(counter - 1);
    }
}
