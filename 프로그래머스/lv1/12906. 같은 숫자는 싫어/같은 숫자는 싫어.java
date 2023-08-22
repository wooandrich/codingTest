import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        Deque<Integer> dq = new ArrayDeque<>();

        int num = 0;

        for (int i : arr) {
            if (dq.isEmpty()) {
                dq.push(i);
            } else {
                if (dq.peek() != i) dq.push(i);
            }

        }

        for (Integer i : dq) {
            list.add(i);
        }
        
        Collections.reverse(list);






        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}