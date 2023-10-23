import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, 1, -1};
    static int[][] originalMap;
    static int n,m;
    static int maxSafeZone = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        originalMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                originalMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);

        System.out.println(maxSafeZone);




    }

    static void dfs(int wallCnt) {
        // 벽이 3개가 되면 bfs시작
        if (wallCnt == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (originalMap[i][j] == 0) {
                    originalMap[i][j] = 1;
                    dfs(wallCnt + 1);
                    originalMap[i][j] = 0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (originalMap[i][j] == 2) {
                    q.add(new Node(i, j));
                }
            }
        }

        // 원본 연구소를 바꾸지 않기 위해 카피맵 사용
        int[][] copyMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            copyMap[i] = originalMap[i].clone();
        }

        // bfs 탐색시작
        while (!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 빈칸을 경우에만 바이러스를 퍼트림
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (copyMap[nx][ny] == 0) {
                        q.add(new Node(nx, ny));
                        copyMap[nx][ny] = 2;
                    }
                }
            }
        }


        // safeZone 확인
        funSafeZone(copyMap);







    }

    private static void funSafeZone(int[][] copyMap) {
        int safeZone = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 0) safeZone++;
            }
        }
        maxSafeZone = Math.max(maxSafeZone, safeZone);
    }


    // 큐에 좌표를 넣기 위해서
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }





}






