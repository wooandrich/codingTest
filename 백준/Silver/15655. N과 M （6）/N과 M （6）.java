import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            dfs(String.valueOf(arr[i]),i, 1);
        }
    }
    static private void dfs(String str,int now, int count) {
        if (count == m) {
            System.out.println(str);
        }
        for (int i = now + 1; i < arr.length; i++) {
            if (!visited[i]) {
                dfs(str + " " + String.valueOf(arr[i]),i, count + 1);
            }
        }

    }
}