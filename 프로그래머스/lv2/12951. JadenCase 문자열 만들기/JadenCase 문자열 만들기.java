import java.util.regex.Pattern;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        if (Character.isDigit(arr[0])) {
            answer += arr[0];
        } else {
            answer += Character.toUpperCase(arr[0]);
        }

        for (int i = 1; i < s.length(); i++) {
            if (arr[i - 1] == ' ') {
                answer += Character.toUpperCase(arr[i]);
            } else {

                answer += Character.toLowerCase(arr[i]);
            }
        }

        return answer;
    }
}