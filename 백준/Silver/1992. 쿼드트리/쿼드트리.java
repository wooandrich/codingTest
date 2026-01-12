import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, num;
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }

        quardTree(0, 0, n);


        System.out.println(sb);

    }

    static void quardTree(int y, int x, int length) {
        if (check(y, x, length)) {
            sb.append(arr[y][x]);
            return;
        }

        sb.append("(");

        int half = length / 2;

        quardTree(y, x, half);
        quardTree(y, x + half, half);
        quardTree(y + half, x, half);
        quardTree(y + half, x + half, half);

        sb.append(")");
    }

    static boolean check(int y, int x, int length) {
        int target = arr[y][x];
        for (int i = y; i < y + length; i++) {
            for (int j = x; j < x + length; j++) {
                if (target != arr[i][j]) return false;
            }
        }
        return true;
    }

}

