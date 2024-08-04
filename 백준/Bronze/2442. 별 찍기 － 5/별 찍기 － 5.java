import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String a = " ";
        String b = "*";

        for (int i = 1; i <= n; i++) {
            System.out.println(a.repeat(n - i) + b.repeat(2 * i - 1));
        }







    }


}
