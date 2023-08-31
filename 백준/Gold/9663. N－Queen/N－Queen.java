import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

class Main {

    static int n;
    static int count;
    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        count = 0;
        arr = new int[15];

        solve(0);
        System.out.println(count);



    }

    static void solve(int index) {
        // 마지막 행이면 return
        if (index == n) {
            count++;
            return;
        } else {
            for (int i = 0; i < n; i++) {
                arr[index] = i;
                // 대각선 밑 같은 행인지 확인해야됨
                if (success(index)) {
                    solve(index + 1);
                }
            }
        }

    }

    private static boolean success(int index) {
        for (int i = 0; i < index; i++) {
            if (arr[index] == arr[i] || (index - i) == (Math.abs(arr[i] - arr[index]))) {
                return false;
            }
        }
        return true;

    }


}