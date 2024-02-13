import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();

        int a = 0;
        int b = 0;

        for (int i = 1; i <= h; i++) {
            a++;
            i += n;
        }

        for (int i = 1; i <= w; i++) {
            b++;
            i += m;
        }

        System.out.println(a * b);



        }




}






