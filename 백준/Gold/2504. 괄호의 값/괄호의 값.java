import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

class Main {

    /**
     * ( -> ) 들어오면 +2 아니면 2 *
     * [ -> ] 들어오면 +3 아니면 3 *
     * 괄호가 안 닫히면 0 출력하기
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int ans = 0;
        int count = 1;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            char nowStr = arr[i];
            if (nowStr == '(' || nowStr == '[') {
                stack.add(nowStr);
                count *= (nowStr == '(') ? 2 : 3;
            } else {
                if (stack.isEmpty()) {
                    ans = 0;
                    break;
                } else {
                    char beforeStr = stack.pop();
                    if (nowStr == ')') {
                        if (beforeStr != '(') {
                            ans = 0;
                            break;
                        } else {
                            if (arr[i - 1] == '(') {
                                ans += count;
                            }
                            count /= 2;
                        }
                    } else {
                        if (beforeStr != '[') {
                            ans = 0;
                            break;
                        } else {
                            if (arr[i - 1] == '[') {
                                ans += count;
                            }
                            count /= 3;
                        }
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }


    }


    }






