import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] prefix = new int[n + 1];
        prefix[0] = -1001;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            prefix[i+1] = Math.max(prefix[i] + arr[i], arr[i]);
        }


        System.out.println(Arrays.stream(prefix).max().getAsInt());








    }
}