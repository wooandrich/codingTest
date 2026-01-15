import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<BigInteger> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String temp = "";
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    temp += c;
                }
                else {
                    if (!temp.isEmpty()) {
                        arr.add(new BigInteger(temp));
                        temp = "";
                    }
                }
            }
            if (!temp.isEmpty()) {
                arr.add(new BigInteger(temp));
            }
        }

        Collections.sort(arr);

        for (BigInteger ans : arr) {
            System.out.println(ans);
        }



    }

}

