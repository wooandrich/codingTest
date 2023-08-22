import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();

        List<Character> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.empty() && s.charAt(i) == ')') {
                return false;
            }

            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        if (!st.empty()) {
            answer = false;
        }

        return answer;
    }
}