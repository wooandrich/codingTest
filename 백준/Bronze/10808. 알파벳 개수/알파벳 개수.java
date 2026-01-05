import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];


        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int alpha = s.charAt(i) - 'a';
            arr[alpha]++;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}

