import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[][] arr;
    static int[][] maxDp;
    static int[][] minDp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][3];
        maxDp = new int[n][3];
        minDp = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Arrays.fill(maxDp[i], -1);
            Arrays.fill(minDp[i], 10);
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxResult = Math.max(recurMax(0, 0),
                Math.max(recurMax(0, 1), recurMax(0, 2)));

        int minResult = Math.min(recurMin(0, 0),
                Math.min(recurMin(0, 1), recurMin(0, 2)));

        System.out.println(maxResult + " " + minResult);



    }

    private static int recurMax(int level, int idx) {
        if (level == n - 1) {
            return arr[level][idx];
        }

        if (maxDp[level][idx] != -1) {
            return maxDp[level][idx];
        }

        if (idx == 0) {
            maxDp[level][idx] = Math.max(recurMax(level + 1, idx) + arr[level][idx], recurMax(level + 1, idx + 1) + arr[level][idx]);
        } else if (idx == 1) {
            maxDp[level][idx] = Math.max(recurMax(level + 1, idx - 1) + arr[level][idx]
                    , Math.max(recurMax(level + 1, idx) + arr[level][idx], recurMax(level + 1, idx + 1) + arr[level][idx]));
        } else {
            maxDp[level][idx] = Math.max(recurMax(level + 1, idx - 1) + arr[level][idx], recurMax(level + 1, idx) + arr[level][idx]);
        }

        return maxDp[level][idx];
    }

    private static int recurMin(int level, int idx) {
        if (level == n - 1) {
            return arr[level][idx];
        }

        if (minDp[level][idx] != 10) {
            return minDp[level][idx];
        }

        if (idx == 0) {
            minDp[level][idx] = Math.min(recurMin(level + 1, idx) + arr[level][idx], recurMin(level + 1, idx + 1) + arr[level][idx]);
        } else if (idx == 1) {
            minDp[level][idx] = Math.min(recurMin(level + 1, idx - 1) + arr[level][idx]
                    , Math.min(recurMin(level + 1, idx) + arr[level][idx], recurMin(level + 1, idx + 1) + arr[level][idx]));
        } else {
            minDp[level][idx] = Math.min(recurMin(level + 1, idx - 1) + arr[level][idx], recurMin(level + 1, idx) + arr[level][idx]);
        }

        return minDp[level][idx];
    }


}
