import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);

            if (i == 0) {
                stack.add(a);
            } else {
                if (!stack.isEmpty() && stack.peek().equals(a)) {
                    stack.pop();
                } else {
                    stack.add(a);
                }
            }
        }

        if (stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}