import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for(int i=score.length - 1;i>=m-1;i-=m) {
            int temp = 10;
            for (int j = i;j>i-m;j--){
                temp = Math.min(temp, score[j]);
            }

            answer += temp * m;
        }

        return answer;
    }
}