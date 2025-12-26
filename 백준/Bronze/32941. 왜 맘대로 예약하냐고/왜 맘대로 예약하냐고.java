import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        String ans = "YES";

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int check = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                int result = Integer.parseInt(st.nextToken());
                if (result == x) {
                    check = 1;
                    break;
                }
            }
            if (check != 1) {
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}

