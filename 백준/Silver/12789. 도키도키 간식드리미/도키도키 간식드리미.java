import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() == cnt) {
                queue.poll();
                cnt++;
            } else if (!stack.isEmpty() && stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                stack.push(queue.poll());
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == cnt) {
                stack.pop();
                cnt++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
        












    }


}






