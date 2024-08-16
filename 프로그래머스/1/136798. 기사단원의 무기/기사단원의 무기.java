import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> arr = new ArrayList<>();
        int answer = 0;
        
        for (int i=1;i<=number;i++){
            int cnt = 0;
            for (int j=1;j*j<=i;j++){
                if(j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }
            if (cnt > limit) arr.add(power);
            else arr.add(cnt);
        }
        return arr.stream().mapToInt(i -> i).sum();
    }
}