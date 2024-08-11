import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringBuilder start = new StringBuilder();
        StringBuilder mid = new StringBuilder();
        StringBuilder end = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            start.append(" ".repeat(i)).append("*".repeat(2 * (n - i) - 1)).append("\n");
            end.append(" ".repeat(n - (i + 2))).append("*".repeat(2 * (i+1) + 1)).append('\n');
        }
        mid.append(" ".repeat(n - 1)).append("*").append("\n");
        ans.append(start.toString()).append(mid.toString()).append(end.toString());

        System.out.println(ans);
    }
}