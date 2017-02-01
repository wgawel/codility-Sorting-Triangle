package pl.gawly;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {
            if ((long) A[i-2] + A[i-1] > A[i] &&
                    (long) A[i-1] + A[i] > A[i-2] &&
                    (long) A[i-2] + A[i] > A[i-1]) {
                return 1;
            }
        }
        return 0;
    }
}
