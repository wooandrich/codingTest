import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            String s = br.readLine();
            boolean sign = true;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(1);
                } else {
                    if (stack.isEmpty()) {
                        sign = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (sign && stack.isEmpty()) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);




    }

}

