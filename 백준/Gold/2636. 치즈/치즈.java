import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    static int[][] arr;
    static int[][] check;
    static int ansTime;
    static int ansCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (!isDone()) {
            Queue<int[]> queue = new LinkedList<>();
            Queue<int[]> next = new LinkedList<>();
            check = new int[n][m];

            queue.add(new int[]{0,0});
            check[0][0] = 1;

            while(!queue.isEmpty()) {
                int[] now = queue.poll();
                int y = now[0];
                int x = now[1];

                for (int i = 0; i < 4; i++) {
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;
                    if (arr[ny][nx] == 0 && check[ny][nx] == 0) {
                        queue.add(new int[] {ny, nx});
                        check[ny][nx] = 1;
                    }

                    if (arr[ny][nx] == 1 && check[ny][nx] == 0) {
                        next.add(new int[] {ny, nx});
                        check[ny][nx] = 1;
                    }
                }
            }



            int nowCnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 1) nowCnt++;
                }
            }
            ansCnt = nowCnt;

            for (int[] val : next) {
                arr[val[0]][val[1]] = 0;
            }
            ansTime++;
        }

        System.out.println(ansTime);
        System.out.println(ansCnt);


    }

    static boolean isDone() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) return false;
            }
        }
        return true;
    }





}

