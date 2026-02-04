import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        int ans = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    Queue<int[]> q = new LinkedList<>();
                    int[][] check = new int[n][m];

                    q.add(new int[]{i,j});
                    check[i][j] = 1;

                    while (!q.isEmpty()) {
                        int[] temp = q.poll();

                        int y = temp[0];
                        int x = temp[1];

                        for (int k = 0; k < 4; k++) {
                            int ny = y + dy[k];
                            int nx = x + dx[k];

                            if (ny < 0 || ny >= n || nx < 0 || nx >= m) continue;

                            if (arr[ny][nx] == 'L' && check[ny][nx] == 0) {
                                check[ny][nx] += check[y][x] + 1;
                                q.add(new int[]{ny, nx});
                            }
                        }

                    }

                    ans = Math.max(ans, maxArrResult(check));
                }
            }
        }

        System.out.println(ans - 1);



    }

    static int maxArrResult(int[][] check) {
        int result = 0;

        for (int i = 0; i < check.length; i++) {
            for (int j = 0; j < check[i].length; j++) {
                result = Math.max(result, check[i][j]);
            }
        }

        return result;
    }





}

