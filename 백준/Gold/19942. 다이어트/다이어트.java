import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int mp,mf,ms,mu;
    static int[][] arr;
    static int ans = Integer.MAX_VALUE;
    static List<Integer> list = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][5];

        StringTokenizer st = new StringTokenizer(br.readLine());
        mp = Integer.parseInt(st.nextToken());
        mf = Integer.parseInt(st.nextToken());
        ms = Integer.parseInt(st.nextToken());
        mu = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
            arr[i][4] = Integer.parseInt(st.nextToken());
        }

        recur(0,0, 0, 0, 0, 0);


        if (!list2.isEmpty()) {
            System.out.println(ans);
            Collections.sort(list2);
            list2.stream().forEach(x -> System.out.print(x + " "));
        } else {
            System.out.println(-1);
        }


    }

    static void recur(int num, int p, int f, int s, int u, int price) {
        if (price > ans) return;

        if (p >= mp && f >= mf && s >= ms && u >= mu) {
            if (price < ans) {
                ans = price;
                list2 = new ArrayList<>(list);
            }
            return;
        }
        if (num == n) {
            return;
        }
        list.add(num+1);
        recur(num + 1, p + arr[num][0], f + arr[num][1], s + arr[num][2], u + arr[num][3], price + arr[num][4]);
        list.remove(list.size()-1);
        recur(num + 1, p, f, s, u, price);
    }




}