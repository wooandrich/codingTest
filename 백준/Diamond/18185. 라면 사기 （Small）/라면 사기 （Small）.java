import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int idx = 0;
        int ans = 0;

        while (idx < n) {
            if (arr[idx] > 0) {
                int temp = arr[idx];
                ans += 3 * temp;
                temp = Math.min(temp, arr[idx + 1]);
                ans += 2 * temp;
                arr[idx + 1] -= temp;
                temp = Math.min(temp, arr[idx + 2] - Math.min(arr[idx + 1], arr[idx + 2]));
                ans += 2 * temp;
                arr[idx + 2] -= temp;
            }
            idx++;
        }
        System.out.println(ans);






        }




}






