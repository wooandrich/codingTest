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
    static int n,m,k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> result = new ArrayList<>();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < k; i++) {
            int a,b,c,d;
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());

            for (int p = b; p < d; p++) {
                for (int q = a; q < c; q++) {
                    arr[p][q] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0 && visited[i][j] == 0) {
                    int cnt = dfs(i,j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (int ans : result) {
            sb.append(ans).append(" ");
        }
        System.out.println(result.size());
        System.out.println(sb);



    }

    static int dfs(int y, int x) {
        visited[y][x] = 1;
        int cnt = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
            if (arr[ny][nx] == 0 && visited[ny][nx] == 0) {
                cnt += dfs(ny, nx);
            }
        }
        return cnt;
    }
}

