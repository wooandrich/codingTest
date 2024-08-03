import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] arr = new int[13][32];
        int day = 0;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                if (i == 2) {
                    if(j > 28) break;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    if (j > 30) break;
                }
                arr[i][j] = (day++) % 7;
            }
        }
        String[] ans = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        System.out.println(ans[arr[x][y]]);
    }

}
