import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int target = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n-1;
        int ans = 0;
        while (start < end) {
            if (arr[start] + arr[end] > target) {
                end--;
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                ans++;
                start++;
            }
        }
        System.out.println(ans);








    }
}

