import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        recur(0, 1, 0,0);

        System.out.println(ans);




    }

    static void recur(int num, int sin, int ssen, int use) {
        if (num == n) {
            if (use == 0) {
                return;
            }
            ans = Math.min(ans, Math.abs(ssen - sin));
            return;
        }
        recur(num + 1, sin * arr[num][0], ssen + arr[num][1], use + 1);
        recur(num + 1, sin, ssen, use);
    }


}