import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.merge(String.valueOf(s.charAt(i)), 1, Integer::sum);
        }
        StringBuilder ans = new StringBuilder();
        if (s.length() % 2 == 0) {
            // 길이 짝수면 무조건 짝수만큼 있어야함
            for (int cnt : map.values()) {
                if (cnt % 2 != 0) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                ans.append(m.getKey().repeat(m.getValue() / 2));
            }
            String original = ans.toString();
            ans.append(new StringBuilder(original).reverse());
        } else {
            // 길이 홀수면 홀수길이는 1개만큼만
            int oddCnt = 0;
            for (int cnt : map.values()) {
                if (cnt % 2 != 0) oddCnt++;
            }
            if (oddCnt != 1) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
            String middle = "";
            for (Map.Entry<String, Integer> m : map.entrySet()) {
                if (m.getValue() % 2 != 0 ) {
                    middle = m.getKey();
                    map.merge(m.getKey(), -1, Integer::sum);
                }
                ans.append(m.getKey().repeat(m.getValue() / 2));
            }
            String original = ans.toString();
            ans.append(middle);
            ans.append(new StringBuilder(original).reverse());
        }

        System.out.println(ans);









    }
}

