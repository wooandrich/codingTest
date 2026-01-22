import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        buildWall(arr, 0, 0,  0);

        System.out.println(ans);




    }

    static void buildWall(int[][] arr, int y, int x, int cnt) {
        if (cnt == 3) {
            int[][] visited = new int[n][m];
            int[][] tempArr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    tempArr[i][j] = arr[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (tempArr[i][j] == 2 && visited[i][j] == 0) {
                        dfs(tempArr, visited, i, j);
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (tempArr[i][j] == 0) {
                        result++;
                    }
                }
            }
            ans = Math.max(ans, result);
            return;
        }
        int startI = y;
        int startJ = x;
        if (x == m) {
            startI++;
            startJ = 0;
        }
        for (int i = startI; i < n; i++) {
            int k = (i == startI) ? startJ : 0;
            for (int j = k; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    buildWall(arr, i, j+1, cnt + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static void dfs(int[][] tempArr, int[][] visited, int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (tempArr[ny][nx] == 0 && visited[ny][nx] == 0) {
                tempArr[ny][nx] = 2;
                dfs(tempArr, visited, ny, nx);
            }
        }
    }

}

