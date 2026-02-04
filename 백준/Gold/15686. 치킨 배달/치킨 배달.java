import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;
    static int n,m;
    static int ans = 1000000;
    static List<int[]> homeList = new ArrayList<>();
    static List<int[]> chickenList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (num == 1) {
                    homeList.add(new int[]{i, j});
                }

                if (num == 2) {
                    chickenList.add(new int[]{i, j});
                }
                arr[i][j] = num;
            }
        }

        for (int i = 1; i <= m; i++) {
            List<int[]> candidates = new ArrayList<>();

            setChicken(candidates, 0, i);
        }

        System.out.println(ans);


    }

    static void setChicken(List<int[]> candidates, int startIdx, int limit) {
        if (candidates.size() == limit) {
            findDistance(candidates);
            return;
        }

        for (int i = startIdx; i < chickenList.size(); i++) {
            candidates.add(chickenList.get(i));
            setChicken(candidates, i + 1, limit);
            candidates.remove(candidates.size() - 1);
        }

    }

    static void findDistance(List<int[]> candidates) {
        int distance = 0;

        for (int[] home : homeList) {
            int tempDistance = 100000;

            for (int[] candidate : candidates) {
                tempDistance = Math.min(tempDistance, Math.abs(home[0] - candidate[0]) + Math.abs(home[1] - candidate[1]));
            }
            distance += tempDistance;
        }

        ans = Math.min(distance, ans);
    }





}

