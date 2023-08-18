class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 != 0) {
            int num = (s.length() - 1) / 2;
            answer += s.charAt(num);
        } else {
            int num = s.length() / 2;
            answer += s.charAt(num - 1);
            answer += s.charAt(num);
        }

        return answer;
    }
}