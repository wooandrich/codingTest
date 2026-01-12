import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] mo = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String s = br.readLine();
            if ("end".equals(s)) break;

            boolean isCheck = true;
            int moCnt = 0;
            int moYean = 0;
            int jaYean = 0;
            char preVal = 0;
            for (char c : s.toCharArray()) {
                if (isMo(c, mo)) {
                    moCnt++;
                    moYean++;
                    jaYean = 0;
                } else {
                    moYean = 0;
                    jaYean++;
                }

                if (moYean >= 3) {
                    isCheck = false;
                    break;
                }

                if (jaYean >= 3) {
                    isCheck = false;
                    break;
                }

                if (c != 'e' && c != 'o' && preVal == c) {
                    isCheck = false;
                    break;
                }
                preVal = c;
            }
            if (moCnt == 0) isCheck = false;

            if (isCheck) {
                sb.append("<").append(s).append(">").append(" is acceptable.").append('\n');
            } else {
                sb.append("<").append(s).append(">").append(" is not acceptable.").append('\n');
            }

        }

        System.out.println(sb);



    }
    static boolean isMo(char c, char[] arr) {
        for (char mo : arr) {
            if (mo == c) return true;
        }
        return false;
    }

}

