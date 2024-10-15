import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ans = 0;

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'L') {
                    int[][] visited = new int[n][m];
                    for (int k = 0; k < n; k++) {
                        Arrays.fill(visited[k], -1);
                    }
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = 0;
                    int cnt = 0;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                                if (visited[nx][ny] == -1) {
                                    if (grid[nx][ny] == 'L') {
                                        visited[nx][ny] = visited[x][y] + 1;
                                        q.add(new int[]{nx, ny});
                                        cnt = Math.max(cnt, visited[nx][ny]);
                                    }
                                }
                            }
                        }
                    }
                    ans = Math.max(ans, cnt);

                }
            }
        }

        System.out.println(ans);




    }








}