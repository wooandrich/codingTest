import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, m, maxVal;
    static List<List<Integer>> arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

//            arr.get(a).add(b);
            arr.get(b).add(a);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] check = new int[n];
            check[i] = 1;
            int dfsResult = dfs(check, i);
            map.put(i+1,dfsResult);
            maxVal = Math.max(maxVal, dfsResult);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (maxVal == map.get(i)) sb.append(i).append(" ");
        }
        sb.append('\n');

        System.out.println(sb.toString());

    }

    static int dfs(int[] check, int start) {
        int nodeCnt = 1;

        for (int newNode : arr.get(start)) {
            if (check[newNode] == 0) {
                check[newNode] = 1;
                nodeCnt += dfs(check, newNode);
            }
        }


        return nodeCnt;
    }






}

