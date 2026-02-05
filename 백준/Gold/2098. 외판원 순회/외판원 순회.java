import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static final int INF = 987654321;
    static int n;
    static int[][] dp, dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n][1 << n];
        dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }

        System.out.println(tsp(0, 1));

    }

    static int tsp(int here, int visited) {
        if (visited == (1 << n) - 1) {
            return dist[here][0] != 0 ? dist[here][0] : INF;
        }

        if (dp[here][visited] != -1) {
            return dp[here][visited];
        }

        dp[here][visited] = INF;

        for (int i = 0; i < n; i++) {
            if ((visited & (1 << i)) != 0) continue;

            if (dist[here][i] == 0) continue;

            int next = tsp(i, visited | 1 << i) + dist[here][i];
            dp[here][visited] = Math.min(dp[here][visited], next);
        }

        return dp[here][visited];
    }





}

