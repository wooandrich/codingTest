import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int n, m;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static char[][] arr;
    static int[][] dp;
    static boolean[][] visited;
    static boolean isLoop;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        dp = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
            Arrays.fill(dp[i], -1);
        }

        int ans = solve(0, 0);
        if (isLoop) ans = -1;
        System.out.println(ans);

    }

    static int solve(int y, int x) {
        if (isLoop) return 0;

        if (visited[y][x]) {
            isLoop = true;
            return 0;
        }

        if (dp[y][x] != -1) return dp[y][x];

        visited[y][x] = true;
        int count = arr[y][x] - '0';
        dp[y][x] = 1;

        for (int k = 0; k < 4; k++) {
            int ny = y + dy[k] * count;
            int nx = x + dx[k] * count;

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (arr[ny][nx] == 'H') continue;

            dp[y][x] = Math.max(dp[y][x], solve(ny, nx) + 1);
        }
        visited[y][x] = false;
        
        return dp[y][x];
    }








}

