import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int t, w, ans;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int[] arr;
    static int[][] dp;
    static boolean[][] visited;
    static boolean isLoop;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        dp = new int[t + 1][w + 1];
        arr = new int[t + 1];

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= t; i++) {
            for (int j = 0; j <= w; j++) {
                int tree = (j % 2 == 0) ? 1 : 2;
                int gain = (arr[i] == tree) ? 1 : 0;

                dp[i][j] = dp[i - 1][j] + gain;

                if (j > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + gain);
                }
            }
        }

        for (int i = 0; i <= w; i++) {
            ans = Math.max(ans, dp[t][i]);
        }

        System.out.println(ans);

    }









}

