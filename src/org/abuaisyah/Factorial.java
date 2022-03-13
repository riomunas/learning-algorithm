package org.abuaisyah;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println("~~ Solution 1");
//        System.out.println(solution1(4));
//        System.out.println("~~ Solution 2");
//        System.out.println(solution2(1, 4));
        System.out.println(mySolution1(4, 1));
    }

    private static int solution2(int total, int number) {
        if (number <= 0) return total;
        int x = solution2(number * total, number - 1);
        System.out.println(number);
        return x;
    }

    private static int solution1(int number) {
        if (number == 0)
            return 1;
        int x = number * solution1(number -1);
        System.out.println(number);
        return x;
    }

    private static int solution(int number) {
        int result = 1;
//        n=3
//        3*2*1
        if (number == 0) return 1;
        for (int i=number; i>0; i--) {
            result = result*i;
        }
        return result;
    }

    private static int mySolution(int number) {
        if (number == 0)
            return 1;

        return number * mySolution(number-1);
        // 3 * ( 2 * (1 * 1))
    }

    private static int mySolution1(int number, int result) {
        if (number <= 0 )
            return result;

        return mySolution1(number-1, result * number);
    }
}
