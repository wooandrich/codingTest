import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static HashMap<String, ArrayList<String>> edges;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        edges = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String a = st.nextToken();
            String b = st.nextToken();

            if(!edges.containsKey(a)) {
                edges.put(a, new ArrayList<>());
            }
            edges.get(a).add(b);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        if (dfs(a, b) || dfs(b, a)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }



    }
    private static boolean dfs(String now, String parent) {
        if (now.equals(parent)) {
            return true;
        }

        if (edges.get(now) == null) {
            return false;
        }
        for (String next : edges.get(now)) {
            if (dfs(next, parent))
                return true;
        }
        return false;
    }

}
