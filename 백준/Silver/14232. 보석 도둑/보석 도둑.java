import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Long> arr = new ArrayList<>();

        long n = Long.parseLong(br.readLine());

        for (long i = 2; i * i  < n + 1; i++) {
            while (n % i == 0) {
                arr.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            arr.add(n);
        }
        Collections.sort(arr);
        System.out.println(arr.size());
        arr.stream().forEach(x -> System.out.print(x + " "));






    }
}