import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(temp[0]);
            arr[i][1] = Integer.parseInt(temp[1]);
            arr[i][2] = Integer.parseInt(temp[2]);
        }

        int ans = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i != j && i != k && j != k) {
                        boolean flag = true;

                        for (int[] temp : arr) {
                            int num = temp[0];
                            int strike = temp[1];
                            int ball = temp[2];

                            int a = num / 100;
                            int b = num % 100 / 10;
                            int c = num % 100 % 10;

                            int strikeNum = 0;
                            int ballNum = 0;

                            if (i == a) {
                                strikeNum++;
                            } else if (i == b || i == c) {
                                ballNum++;
                            }

                            if (j == b) {
                                strikeNum++;
                            } else if (j == c || j == a) {
                                ballNum++;
                            }
                            if (k == c) {
                                strikeNum++;
                            } else if (k == a || k == b) {
                                ballNum++;
                            }

                            if (strike != strikeNum || ball != ballNum) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);

    }
}