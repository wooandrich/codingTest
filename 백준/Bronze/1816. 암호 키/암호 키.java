import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }
        for (long num : arr) {
            boolean flag = true;
            for (int i = 2; i <= 1000000; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}