import java.io.*;
import java.util.*;

public class Main {
    static int ans = 0;
    static int n;
    static int[][] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        dp = new int[n];
        Arrays.fill(dp, -1);

        recur(0);

        System.out.println(dp[0]);




    }

    static int recur(int idx) {
        if (idx == n) {
            return 0;
        }
        if (idx > n) return -999999;
        if (dp[idx] != -1) return dp[idx];

        dp[idx] = Math.max(recur(idx + arr[idx][0]) + arr[idx][1], recur(idx + 1));

        return dp[idx];
    }






}