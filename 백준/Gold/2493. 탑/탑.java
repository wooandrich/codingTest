import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {
    static class Top{
        int num; // 탑의 번호
        int height; // 탑의 높이

        public Top(int num, int height) {
            this.num = num;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Top> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());

            while (true) {
                if (stack.empty()) {
                    sb.append(0 + " ");
                    stack.push(new Top(i, height));
                    break;
                } else {
                    Top top = stack.peek();
                    if (height > top.height) {
                        stack.pop();
                    } else {
                        stack.push(new Top(i, height));
                        sb.append(top.num + " ");
                        break;
                    }
                }
            }



        }

        System.out.println(sb.toString());



    }


}






