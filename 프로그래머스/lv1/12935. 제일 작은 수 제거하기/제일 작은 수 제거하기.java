import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> arr2 = new ArrayList<>();

        for (int i : arr) {
            arr2.add(i);
        }

        if (arr2.size() == 1) {
            answer = new int[]{-1};
        } else {
            int minIndex = arr2.get(0);
            for (int i = 0; i < arr2.size(); i++) {
                minIndex = Math.min(arr2.get(i), minIndex);
            }
            arr2.remove(arr2.indexOf(minIndex));
            
            answer = new int[arr2.size()];

            for (int i = 0; i < arr2.size(); i++) {
                answer[i] = arr2.get(i);
            }
        }

        return answer;
    }
}