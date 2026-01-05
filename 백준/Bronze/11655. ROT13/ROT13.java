import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) { // 소문자
                    int idx = (c - 'a' + 13) % 26;
                    sb.append((char)('a' + idx));
                } else {
                    int idx = (c - 'A' + 13) % 26;
                    sb.append((char)('A' + idx));
                }
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);





    }
}

