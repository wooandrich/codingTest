import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int i = 0;
        while (true) {
            if (n == cnt) break;

            i++;

            String s = String.valueOf(i);
            if (s.contains("666")) {
                cnt++;
            }
        }

        System.out.println(i);





    }

}

