import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < n + 1; k++) {
                    if (i + j + k == n) {
                        if (k >= j + 2) {
                            if (i > 0 && j > 0 && k > 0) {
                                if (i % 2 == 0) {
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);

    }
}