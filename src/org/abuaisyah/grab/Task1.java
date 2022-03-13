package org.abuaisyah.grab;

public class Task1 {
    public static void main(String[] args) {
        int[] A = {5, 1, 2, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (i==0)
                ans = A[0];

            if (ans > A[i])
                ans = A[i];
        }
        return ans;
    }
}
