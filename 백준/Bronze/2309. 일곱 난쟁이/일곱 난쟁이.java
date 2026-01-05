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
        int[] arr = new int[9];
        int total = 0;

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            total += num;
        }
        Arrays.sort(arr);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - arr[i] - arr[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(arr[k]).append('\n');
                        }
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}

