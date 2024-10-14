import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = n;

        for (int num : arr) {
            boolean flag = true;
            if (num == 1) {
                ans--;
            } else {
                for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ans--;
                        break;
                    }
                }

            }

        }
        System.out.println(ans);



    }
}