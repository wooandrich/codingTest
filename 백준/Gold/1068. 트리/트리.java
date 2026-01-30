import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int ans = 0;
    static List<List<Integer>> arr;
    static int skipNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = -1;
        for (int i = 0; i < n; i++) {
            int parentNode = Integer.parseInt(st.nextToken());
            if (parentNode == -1) {
                root = i;
                continue;
            }

            arr.get(parentNode).add(i);
        }

        skipNode = Integer.parseInt(br.readLine());

        dfs(root);


        System.out.println(ans);
    }

    static void dfs(int node) {

        if (node == skipNode) return;

        int childCount = 0;

        if (arr.get(node).isEmpty()) {
            ans++;
            return;
        }


        for (int nowNode : arr.get(node)) {
            if (nowNode != skipNode) {
                childCount++;
                dfs(nowNode);
            }
        }

        if (childCount == 0) {
            ans++;
        }
    }





}

