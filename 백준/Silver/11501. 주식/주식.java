import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 테스트 케이스의 수를 읽어옵니다.
        int t = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대해 반복합니다.
        for(int tc = 0; tc < t; tc++) {
            // 두 번째 줄에서 정수 n을 읽어옵니다.
            int n = Integer.parseInt(br.readLine());

            // 세 번째 줄에서 n개의 정수를 읽어옵니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }

            // 문제 해결 로직을 수행합니다.
            long now = arr[n-1];
            long ans = 0;
            for(int i = n-2; i >= 0; i--) {
                if (now > arr[i]) {
                    ans += now - arr[i];
                } else {
                    now = arr[i];
                }
            }
            System.out.println(ans);
        }
    }
}
