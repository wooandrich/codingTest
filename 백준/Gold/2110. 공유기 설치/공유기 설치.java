import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int house[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        house = new int[n];

        for (int i = 0; i < n; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        int lo = 1;
        int hi = house[n - 1] - house[0] + 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (canInstall(mid) < c) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1);





    }

    static int canInstall(int distance) {
        int count = 1;
        int lastLocate = house[0];

        for (int i = 1; i < house.length; i++) {
            int locate = house[i];

            if (locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        return count;
    }


}