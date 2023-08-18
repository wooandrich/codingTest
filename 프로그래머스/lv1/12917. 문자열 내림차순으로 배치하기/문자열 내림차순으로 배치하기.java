import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();


        List<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arr.add(String.valueOf(s.charAt(i)));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (String string : arr) {
            answer.append(string);
        }






        return answer.toString();
    }
}