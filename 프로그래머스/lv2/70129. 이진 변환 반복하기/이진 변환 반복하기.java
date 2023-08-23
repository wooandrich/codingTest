import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};

        int count = 0;
        int zero = 0;

        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zero++;
            }

            if (s.contains("0")) {
                s = s.replace("0", "");
            }

            s = Integer.toBinaryString(s.length());
            count++;

        }

        answer = new int[]{count, zero};





        return answer;
    }

    public static void main(String[] args) {

    }
}