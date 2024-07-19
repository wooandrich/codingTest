import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            char[] temp = a.toCharArray();
            int length = temp.length;

            for (char c : temp) {
                arr[c - 'A'] += (int) Math.pow(10, length - 1);
                length--;
            }
        }
        Arrays.sort(arr);



        int ans = 0;
        int val = 9;

        for (int i = 25; i >= -1; i--) {
            if(arr[i] == 0) break;
            ans += arr[i] * val--;
        }
        System.out.println(ans);




    }

}
