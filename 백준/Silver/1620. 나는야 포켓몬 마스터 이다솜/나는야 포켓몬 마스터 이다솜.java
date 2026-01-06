import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> nameNumMap = new HashMap<>();
        Map<Integer, String> numNameMap = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();

            nameNumMap.put(name, i + 1);
            numNameMap.put(i + 1, name);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String k = br.readLine();
            if (Character.isDigit(k.charAt(0))) {
                ans.append(numNameMap.get(Integer.parseInt(k))).append('\n');
            } else {
                ans.append(nameNumMap.get(k)).append('\n');
            }
        }

        System.out.println(ans);







    }
}

