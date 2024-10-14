import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        int start = 2;
        int end = n;

        if (n == 1) {

        } else {
            while (start <= end) {
                if (n % start != 0) {
                    start++;
                } else {
                    sb.append(start).append("\n");
                    n = n / start;
                }
            }
        }
        System.out.println(sb.toString());




    }
}