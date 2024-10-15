import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        recur(1);
        System.out.println(ans);


    }

    static void recur(int v) {
        visited[v] = true;

        for (int node : graph[v]) {
            if (!visited[node]) {
                ans++;
                recur(node);
            }
        }
    }







}