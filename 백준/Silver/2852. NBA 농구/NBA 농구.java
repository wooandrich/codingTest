import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int totalSecond = 48 * 60;
        int t = Integer.parseInt(br.readLine());
        int scoreA = 0;
        int scoreB = 0;
        int prevTime = 0;
        int timeA = 0;
        int timeB = 0;

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int team = Integer.parseInt(st.nextToken());
            String[] s = st.nextToken().split(":");
            int scoreTime = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);

            if (scoreA > scoreB) {
                timeA += scoreTime - prevTime;
            }

            if (scoreB > scoreA) {
                timeB += scoreTime - prevTime;
            }

            if (team == 1) {
                scoreA++;
            } else {
                scoreB++;
            }
            prevTime = scoreTime;

        }
        if (scoreA > scoreB) {
            timeA += totalSecond - prevTime;
        }

        if (scoreB > scoreA) {
            timeB += totalSecond - prevTime;
        }



        sb.append(String.format("%02d", timeA / 60)).append(":").append(String.format("%02d", timeA % 60)).append('\n');
        sb.append(String.format("%02d", timeB / 60)).append(":").append(String.format("%02d", timeB % 60)).append('\n');
        System.out.println(sb);



    }

}

