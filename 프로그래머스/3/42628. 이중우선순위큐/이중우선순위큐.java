import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[]{0,0};
        
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);
        
        for (String s : operations) {
            String[] arr = s.split(" ");
            
            String order = arr[0];
            int num = Integer.parseInt(arr[1]);
            
            if ("I".equals(order)) {
                maxPq.add(num);
                minPq.add(num);
            }
            
            if ("D".equals(order)) {
                if (num == 1 && !maxPq.isEmpty()) {
                    int n = maxPq.poll();
                    minPq.remove(n);
                }
                if (num == -1 && !minPq.isEmpty()) {
                    int n = minPq.poll();
                    maxPq.remove(n);
                }
            }
        }
        
        if (!maxPq.isEmpty() && !minPq.isEmpty()) {
            answer[0] = maxPq.peek();
            answer[1] = minPq.peek();
        }
        
        return answer;
    }
}