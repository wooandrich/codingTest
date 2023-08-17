class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int ans = x;
        int num = 0;

        while (x > 0) {
            num += x % 10;
            x /= 10;
        }
        
        if (ans % num != 0) answer = false;


        return answer;
    }
}