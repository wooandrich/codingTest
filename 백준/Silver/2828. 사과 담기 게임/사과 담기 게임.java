import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int j = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < j; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        int left = 1;
        int right = m;

        while (!queue.isEmpty()) {
            int apple = queue.poll();

            if (apple > right) {
                int move = apple - right;
                left += move;
                right += move;
                ans += move;
            }

            if (apple < left) {
                int move = left - apple;
                left -= move;
                right -= move;
                ans += move;
            }
        }
        System.out.println(ans);




    }

}

