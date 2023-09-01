import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] sang = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sang[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sang);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperBound(sang, key) - lowerBound(sang, key)).append(' ');
        }

        System.out.println(sb.toString());

    }

    static int lowerBound(int[] sang, int key) {
        int lo = 0;
        int hi = sang.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (key <= sang[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    static int upperBound(int[] sang, int key) {
        int lo = 0;
        int hi = sang.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (key < sang[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }


}