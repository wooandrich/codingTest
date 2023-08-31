import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt();


        System.out.println(solve(n));




    }

    static long solve(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return solve(n - 1) + solve(n - 2);
    }


}