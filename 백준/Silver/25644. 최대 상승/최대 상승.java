import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

class Main {



    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int start = arr[0];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < start) {
                start = arr[i];
            } else {
                ans = Math.max(ans, arr[i] - start);
            }
        }

        System.out.println(ans);

    }



}






