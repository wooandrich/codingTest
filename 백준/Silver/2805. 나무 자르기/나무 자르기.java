import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> tree = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tree.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(tree);

        int start = 1;
        int end = tree.get(n - 1);
        int mid;

        while (end >= start) {
            long ans = 0;
            mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if (tree.get(i) - mid > 0) ans += tree.get(i) - mid;
            }
            if (ans >= m){
                start = mid + 1;
            }
            else end = mid - 1;
        }


        System.out.println(end);


    }


}