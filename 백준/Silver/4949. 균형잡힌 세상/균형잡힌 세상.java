import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while (!".".equals((s = br.readLine()))) {
            Stack<Character> stack = new Stack<>();
            boolean sign = true;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        sign = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        sign = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && sign) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);



    }

}

