import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (maxHeight < map[i][j]) maxHeight = map[i][j];
            }
        }

        int ans = 0;
        /**
         * 1. 모든 지역탐색
         */
        for (int height = 0; height < maxHeight + 1; height++) {
            visited = new boolean[n][n];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // 2. 안전 영역 탐색
                    if (!visited[i][j] && map[i][j] > height) {
                        cnt += dfs(i, j, height); // 해당 안전 영역 탐색
                    }
                }
            }
            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);








    }

    static int dfs(int x, int y, int height) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n - 1 || ny > n - 1) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            if (map[nx][ny] > height) {
                dfs(nx, ny, height);
            }
        }
        return 1;
    }



}






