import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static List<Integer> arr = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int[] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);

        recur(0);

        System.out.println(sb);







    }

    static void recur(int num) {
        if (num == m) {
            arr.stream().forEach(x -> sb.append(x).append(" "));
            sb.append('\n');
            return;
        }
        for (int i : temp) {
            arr.add(i);
            recur(num + 1);
            arr.remove(arr.size() - 1);
        }
    }
}