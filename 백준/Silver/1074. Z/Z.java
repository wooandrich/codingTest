import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n);

        find(size, r, c);

        System.out.println(ans);

    }
    static void find(int size, int r, int c) {
        if (size == 1) return;

        if(r < size / 2 && c < size / 2) {
            find(size / 2, r, c);
        }
        else if(r < size /  2 && c >= size / 2) {
            ans += size * size / 4;
            find(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            ans += size * size / 4 * 2;
            find(size / 2, r - size / 2, c);
        } else {
            ans += size * size / 4 * 3;
            find(size / 2, r - size / 2, c - size / 2);
        }

    }

}
