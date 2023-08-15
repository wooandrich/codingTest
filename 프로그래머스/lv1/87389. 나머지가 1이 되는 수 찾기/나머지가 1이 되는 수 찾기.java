class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer++;
        
        while(true){
            if(n % answer == 1){
                break;
            } else{
                answer++;
            }
        }
        
        
        return answer;
    }
}