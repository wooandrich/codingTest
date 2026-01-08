import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int[][] arr;
    static int[][] visited;
    static int n, ans, maxVal;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                maxVal = Math.max(maxVal, num);
            }
        }


        for (int depth = 0; depth <= maxVal; depth++) {
            visited = new int[n][n];
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] > depth && visited[i][j] == 0) {
                        dfs(i, j, depth);
                        result++;
                    }
                }
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);



    }

    static void dfs(int y, int x, int depth) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= n || nx < 0 || nx >= n) continue;
            if (arr[ny][nx] > depth && visited[ny][nx] == 0) {
                dfs(ny, nx, depth);
            }
        }
    }
}

