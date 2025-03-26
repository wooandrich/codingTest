import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int ans = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            dfs(i, i, 0, 0);
        }

        System.out.println(ans);



    }

    static void dfs(int start, int now, int cost, int depth) {
        if (depth == n - 1) {
            if (map[now][start] != 0) {
                ans = Math.min(ans, cost + map[now][start]);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && map[now][i] > 0) {
                visited[i] = true;
                dfs(start, i, cost + map[now][i], depth + 1);
                visited[i] = false;
            }
        }

    }




}
