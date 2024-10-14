import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> ans = new ArrayList<>();

        int[] arr = new int[n];
        int[] prefix = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + arr[i];
        }

        for (int i = k; i <= n; i++) {
            ans.add(prefix[i] - prefix[i-k]);
        }

        System.out.println(Collections.max(ans));








    }
}