class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = s(n);
        
        return answer;
    }
    
    int s(int n){
        int answer = 0;
        
        int start = 1;
        
        while(start <= n){
            int plus = 0;
            for(int i=start;i<=n;i++){
                plus += i;
                if(plus == n){
                    answer++;
                    start++;
                    break;
                }
                if(plus > n){
                    start++;
                    break;
                }
            }
            
        }
        
        
        return answer;
    }
}