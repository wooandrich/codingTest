import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> arr = new ArrayList<>();
        for (int number : numbers) {
            arr.add(number);
        }

        for (int i = 0; i < 10; i++) {
            if (!arr.contains(i)) answer += i;
        }
        
        return answer;
    }
}