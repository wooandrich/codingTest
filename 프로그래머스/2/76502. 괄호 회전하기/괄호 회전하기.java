import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        
        for (int i=0;i<length;i++){
            String k = s.substring(i,length) + s.substring(0,i);
            if (solve(k)) answer++;
        }
        
        
        return answer;
    }
    static private boolean solve(String k){
        Stack<Character> stack = new Stack<>();
        
        char[] chars = k.toCharArray();
        
        for (char a : chars) {
            if (a == '(') stack.add(a);
            else if (a == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                else stack.pop();
            }
            else if (a == '[') stack.add(a);
            else if (a == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                else stack.pop();
            }
            else if (a == '{') stack.add(a);
            else if (a == '}') {
                if (stack.isEmpty() || stack.peek() != '{') return false;
                else stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
        
    }
}