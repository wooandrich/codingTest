import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};

        List<Integer> arr = new ArrayList<>();

        while (n > 0){
            arr.add((int) (n%10));
            n /= 10;
        }

        answer = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }




        return answer;
    }
}