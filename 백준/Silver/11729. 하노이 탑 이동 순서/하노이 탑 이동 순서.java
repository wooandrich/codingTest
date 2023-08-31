import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sb = new StringBuilder();

        int n = in.nextInt();

        sb.append((int) Math.pow(2, n) - 1 + "\n");



        solve(n,1,2,3);

        System.out.println(sb.toString());



    }

    static void solve(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + "\n");

        } else {
            solve(n - 1, start, to, mid); // 1 ~ 2
            sb.append(start + " " + to + "\n");
            solve(n - 1, mid, start, to);  // 2 ~ 3
        }

    }


}