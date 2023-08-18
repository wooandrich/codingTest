import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] num = s.split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            arr.add(Integer.valueOf(num[i]));
        }

        Collections.sort(arr);

        answer += arr.get(0);
        answer += " ";
        answer += arr.get(arr.size() - 1);



        return answer;
    }
}