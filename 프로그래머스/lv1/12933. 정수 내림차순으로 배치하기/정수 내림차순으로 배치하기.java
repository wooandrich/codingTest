import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int size = 1;

        List<Integer> arr = new ArrayList<>();

        while(n > 0){
            arr.add((int) (n % 10));
            n /= 10;
        }

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            answer += (long) size * arr.get(i);
            size *= 10;
            System.out.println(answer);
            
        }

        return answer;
    }
}