import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        String pattern = br.readLine();
        StringBuilder front = new StringBuilder();
        StringBuilder back = new StringBuilder();
        boolean isStar = false;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '*') {
                isStar = true;
                continue;
            }

            if (isStar) back.append(pattern.charAt(i));
            else front.append(pattern.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.length() < front.length() + back.length()) {
                ans.append("NE").append('\n');
                continue;
            }
            String sFront = s.substring(0, front.length());
            String sBack = s.substring(s.length() - back.length());

            if (sFront.contentEquals(front) && sBack.contentEquals(back)) {
                ans.append("DA").append('\n');
            } else {
                ans.append("NE").append('\n');
            }

        }

        System.out.println(ans);





    }
}

