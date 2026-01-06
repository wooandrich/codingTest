import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";

        while ((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);

            int result = 0;
            int length = 0;

            while (true) {
                result = (result * 10 + 1) % n;
                length++;
                if (result == 0) break;
            }
            System.out.println(length);
        }

    }
}

