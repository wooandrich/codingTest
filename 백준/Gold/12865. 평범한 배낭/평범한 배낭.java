import java.io.*;
import java.util.*;

public class Main {
    static int n,k;
    static int[][] bag;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        bag = new int[n][2];
        dp = new int[n][100001];



        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            bag[i][0] = Integer.parseInt(st.nextToken());
            bag[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0, 0);

        System.out.println(dp[0][0]);

    }

    static int recur(int idx, int weight) {
        if (weight > k) return -99999;

        if (idx == n) {
            return 0;
        }
        if (dp[idx][weight] != 0) return dp[idx][weight];

        dp[idx][weight] = Math.max(recur(idx + 1, weight + bag[idx][0]) + bag[idx][1], recur(idx + 1, weight));

        return dp[idx][weight];
    }








}