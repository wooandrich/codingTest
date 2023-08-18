import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 6 || s.length() == 4) {
            return Pattern.matches("^[0-9]*$", s);
                
        }

        return answer;
        }


    }