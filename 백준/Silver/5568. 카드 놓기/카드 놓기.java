import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int k;
    static String[] arr;
    static boolean[] visited;
    static Set<String> ans = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new String[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        dfs("", 0);

        System.out.println(ans.size());

    }
    private static void dfs(String s, int size) {
        if (size == k) {
            ans.add(s);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(s + arr[i], size + 1);
                visited[i] = false;
            }
        }
    }

}
