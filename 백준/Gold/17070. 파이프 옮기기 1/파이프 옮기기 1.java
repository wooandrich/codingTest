import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int[] dy = {0, 1, 1};
    static int[] dx = {1, 1, 0};

    static int[][] arr;
    static int[][][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        dp = new int[n][n][3];

        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(move(0,1, 0));


    }

    static int move(int y, int x, int dir) {
        if (y == n - 1 && x == n - 1) {
            return 1;
        }

        if (dp[y][x][dir] != -1) {
            return dp[y][x][dir];
        }

        dp[y][x][dir] = 0;

        if (dir == 0) {
            for (int i : new int[]{0, 1}) {
                dp[y][x][dir] += nextMove(y, x, i);
            }
        } else if (dir == 1) {
            for (int i : new int[]{0, 1, 2}) {
                dp[y][x][dir] += nextMove(y, x, i);
            }
        } else {
            for (int i : new int[]{1, 2}) {
                dp[y][x][dir] += nextMove(y, x, i);
            }
        }

        return dp[y][x][dir];
    }

    static int nextMove(int y, int x, int dir) {

        int ny = y + dy[dir];
        int nx = x + dx[dir];

        if (ny < 0 || ny >= n || nx < 0 || nx >= n) return 0;
        if (arr[ny][nx] == 1) return 0;

        if (dir == 1) {
            if (arr[ny - 1][nx] == 1 || arr[ny][nx - 1] == 1) return 0;
        }

        return move(ny, nx, dir);
    }







}

