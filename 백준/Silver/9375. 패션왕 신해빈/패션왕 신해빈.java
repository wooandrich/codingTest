import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int cnt = Integer.parseInt(br.readLine());
            for (int j = 0; j < cnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String key = st.nextToken();
                map.merge(key, 1, Integer::sum);
            }
            int result = 1;
            for (int a : map.values()) {
                result *= (a + 1);
            }
            ans.append(result - 1).append('\n');
        }
        System.out.println(ans);









    }
}

