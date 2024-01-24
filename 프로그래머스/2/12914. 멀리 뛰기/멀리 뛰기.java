class Solution {
    public long solution(int n) {

        
        long[] answer = new long[2001];
        answer[0] = 1;
        answer[1] = 2;
        
        for(int i=2;i<n;i++){
            answer[i] = (answer[i-1] + answer[i-2]) % 1234567;
        }
        
        return answer[n-1];
    }
    
}