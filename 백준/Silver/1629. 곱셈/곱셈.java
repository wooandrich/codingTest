import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static long c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());


        System.out.println(pow(a, b));


    }

    static long pow(long A, long exponent) {
        if (exponent == 1) {
            return A % c;
        }

        long temp = pow(A, exponent / 2);

        if (exponent % 2 == 1) {
            return (temp * temp % c) * A % c;
        }

        return temp * temp % c;
    }



}