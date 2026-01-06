import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(power(a%c,b,c));


    }

    static long power(long a, long b, long c) {
        if (b == 0) {
            return 1;
        }

        long half = power(a, b / 2, c);
        half = (half * half) % c;

        if (b % 2 != 0) {
            half = (half * a) % c;
        }

        return half;
    }
}

