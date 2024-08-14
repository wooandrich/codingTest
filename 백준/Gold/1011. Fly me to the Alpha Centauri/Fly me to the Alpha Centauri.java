import java.awt.image.Kernel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y -x;

            int max = (int) Math.sqrt(distance);

            if (max * max == distance) {
                System.out.println(2 * max - 1);
            } else if (distance > max * max && distance <= max * max + max) {
                System.out.println(2 * max);
            } else {
                System.out.println(2 * max + 1);
            }
        }






    }


}
