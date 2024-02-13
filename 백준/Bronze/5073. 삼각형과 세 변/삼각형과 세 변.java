import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true) {
            int[] arr = new int[3];
            int a = in.nextInt();
            arr[0] = a;
            int b = in.nextInt();
            arr[1] = b;
            int c = in.nextInt();
            arr[2] = c;

            if (a == 0 && b == 0 & c ==0) return;

            Arrays.sort(arr);

            if (arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            } else {
                if (arr[0] == arr[1] && arr[1] == arr[2]) {
                    System.out.println("Equilateral");
                } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }


        }



        }




}






