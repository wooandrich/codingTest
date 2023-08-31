import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger res = new BigInteger("1");

        int n = in.nextInt();


        if (n <= 20) {
            System.out.println((int) Math.pow(2, n) - 1);
            hanoi(n,1,2,3);

        } else {
            for (int i = 1; i <= n; i++) {
                res = res.multiply(new BigInteger("2"));
            }
            res = res.subtract(new BigInteger("1"));

            System.out.println(res);
        }

        




    }

    static void hanoi(int n, int start, int by, int end) {
        if (n == 1) {
            System.out.println(start + " " + end);

        } else {
            hanoi(n - 1, start, end, by);
            System.out.println(start + " " + end);
            hanoi(n - 1, by, start, end);
        }
    }


}