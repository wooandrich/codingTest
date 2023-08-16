class Solution {
    public int solution(String s) {
        int answer = 0;

        if(s.charAt(0) == '-') {
            s = s.substring(1);
            int ans = Integer.parseInt(s);
            answer -= ans;
            
        } else if(s.charAt(0) == '+') {
            s = s.substring(1);
            int ans = Integer.parseInt(s);
            answer += ans;

        } else {
            int ans = Integer.parseInt(s);
            answer += ans;
        }

        return answer;
    }
}