import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        char[][] weather = new char[h][w];
        int[][] resultArr = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(resultArr[i], -1);
        }

        for (int i = 0; i < h; i++) {
            String s = br.readLine();
            for (int j = 0; j < w; j++) {
                weather[i][j] = s.charAt(j);
            }
        }

        for (int i=0;i<h;i++){
            int rainIdx = -1;
            for (int j = 0; j < w; j++) {
                if (weather[i][j] == 'c') {
                    rainIdx = j;
                    resultArr[i][j] = 0;
                } else if (rainIdx != -1) {
                    resultArr[i][j] = j - rainIdx;
                }
            }
        }

        for (int i=0;i<h;i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println();
        }



    }

}

