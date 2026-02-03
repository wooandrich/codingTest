import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && a > stack.peek()[0]) {
                int[] temp = stack.pop();
                arr[temp[1]] = a;
            }

            stack.push(new int[]{a, i});
        }

        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a).append(" ");
        }

        System.out.println(sb);


    }





}

