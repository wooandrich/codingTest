class Solution {
    boolean solution(String s) {
        
        int cnt = 0;
        
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c == '(') {
                cnt++;
            } else {
                if (cnt == 0) return false;
                else cnt--;
            }
        }
        
        return cnt == 0;


    }
}