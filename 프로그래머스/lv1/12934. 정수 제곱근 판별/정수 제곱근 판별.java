class Solution {
    public long solution(long n) {
        long answer = 0;
        

        for (int i = 1; i <= n; i++) {
            if (Math.pow(i,2) == n) {
                answer = (long) Math.pow(i+1,2);
                break;
            } else if ((Math.pow(i,2)) > n) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}