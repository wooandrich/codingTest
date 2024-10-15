import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static List<Integer> arr = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        recur(0);

        System.out.println(sb);







    }

    static void recur(int num) {
        if (num == m) {
            arr.stream().forEach(x -> sb.append(x).append(" "));
            sb.append("\n");
            return;
        }

        for (int i = 1; i < n + 1; i++) {
            arr.add(i);
            recur(num + 1);
            arr.remove(arr.size() - 1);
        }
    }
}