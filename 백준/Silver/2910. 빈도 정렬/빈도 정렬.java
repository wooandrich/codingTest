import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> idx = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr.add(num);
            cnt.merge(num, 1, Integer::sum);
            idx.putIfAbsent(num, i);
        }

        arr.sort((a, b) ->{
            int result = cnt.get(b) - cnt.get(a);
            if (result != 0) {
                return result;
            }

            return idx.get(a) - idx.get(b);
        });

        StringBuilder sb = new StringBuilder();
        for (int num : arr) sb.append(num).append(" ");
        System.out.println(sb);



    }

}

