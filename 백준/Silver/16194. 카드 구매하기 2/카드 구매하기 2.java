import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = arr[1];

        for (int i = 2; i <= n; i++) {
            for(int j=1; j < i; j++) {
                if(i % j == 0){
                    dp[i] = Math.min(dp[i] ,Math.min(arr[i], Math.min(dp[j] + arr[i-j], dp[j] * (i/j))));
                }else {
                    dp[i] = Math.min(dp[i], Math.min(arr[i], dp[j] + arr[i - j]));
                }
            }
        }
        System.out.println(dp[n]);


    }

}
