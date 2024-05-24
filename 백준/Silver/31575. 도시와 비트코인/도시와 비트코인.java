import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dx = {1, 0};
    public static int[] dy = {0, 1};
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs(0, 0);

        if (visited[n - 1][m - 1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] nums = q.poll();
            int a = nums[0];
            int b = nums[1];

            for (int i = 0; i < 2; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && graph[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});

                }
            }
        }

    }
}






