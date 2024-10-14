import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];

        int bigIndex = 0;
        int lastIndex = 0;
        int ans = 0;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            arr[l] = h;

            if (arr[l] > arr[bigIndex]) {
                bigIndex = l;
            }
            lastIndex = Math.max(l, lastIndex);
        }

        int nowVal = arr[1];
        for (int i = 1; i < bigIndex; i++) {
            if (arr[i] > nowVal) {
                nowVal = arr[i];
            }
            ans += nowVal;
        }

        nowVal = arr[lastIndex];
        for (int i = lastIndex; i > bigIndex; i--) {
            if (arr[i] > nowVal) {
                nowVal = arr[i];
            }
            ans += nowVal;
        }
        ans += arr[bigIndex];
        System.out.println(ans);







    }
}