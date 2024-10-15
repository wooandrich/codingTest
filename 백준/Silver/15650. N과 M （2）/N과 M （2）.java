import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        recur(0);







    }

    static void recur(int num) {
        if (num == m) {
            arr.stream().forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        for (int i = 1; i < n + 1; i++) {
            if (arr.contains(i)) {
                continue;
            }
            if (arr.size() >= 1) {
                if (arr.get(arr.size() - 1) > i) {
                    continue;
                }
            }
            arr.add(i);
            recur(num + 1);
            arr.remove(arr.size() - 1);
        }
    }
}