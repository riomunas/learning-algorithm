package org.abuaisyah;

public class Factorial1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 1));
    }

    private static int solution(int number, int result) {
        if (number == 0) return result;
        int x =  solution(number - 1, (result * number));
        System.out.println(x);
        return x;
    }
}
