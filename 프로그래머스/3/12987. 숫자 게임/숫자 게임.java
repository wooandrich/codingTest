import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int idxOne = 0;
        int idxTwo = 0;
        
        while (idxTwo < B.length) {
            if (A[idxOne] < B[idxTwo]) {
                idxOne++;
                idxTwo++;
                answer++;
            } else {
                idxTwo++;
            }
        }
        
        return answer;
    }
}