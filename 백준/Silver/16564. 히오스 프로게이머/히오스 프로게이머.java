import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int[] level;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        level = new int[n];

        for (int i = 0; i < n; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(level);

        long lo = 1;
        long hi = Integer.MAX_VALUE;

        while (lo < hi) {
            long mid = (lo + hi) / 2;

            if (cal(mid) <= k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        System.out.println(lo - 1);



    }

    static long cal(long plus) {
        long count = 0;

        for (int i = 0; i < level.length; i++) {
            if (plus > level[i]) {
                count += plus - level[i];
            } else {
                break;
            }
        }
        return count;

    }


}