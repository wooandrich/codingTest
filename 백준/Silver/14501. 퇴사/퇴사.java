import java.io.*;
import java.util.*;

public class Main {
    static int ans = 0;
    static int n;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0, 0);

        System.out.println(ans);




    }

    static void recur(int idx, int value) {
        if (idx == n) {
            ans = Math.max(ans, value);
            return;
        }
        if (idx + arr[idx][0] <= n) {
            recur(idx + arr[idx][0], value + arr[idx][1]);
        }

        recur(idx + 1, value);
    }






}