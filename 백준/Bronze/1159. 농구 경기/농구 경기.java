import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            arr[name.charAt(0) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                sb.append((char) ('a' + i));

            }
        }
        if (sb.length() == 0) {
            sb.append("PREDAJA");
        }
        System.out.println(sb);





    }
}

