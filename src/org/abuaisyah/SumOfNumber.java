package org.abuaisyah;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println(solution(1234));
    }

    private static int solution(int value) {
        int result = 0;
        return sumOf(value, result);
    }

    private static int sumOf(int value, int sum) {
        System.out.println("~~> "+value);
        //sampai modulonya 0
        if (value % 10 == 0) {
            return sum;
        }
        //modulony di sum
        sum = sum + value % 10;
        //divided nya jadi bilangan baru
        value = value / 10;

        return sumOf(value, sum);
    }
}