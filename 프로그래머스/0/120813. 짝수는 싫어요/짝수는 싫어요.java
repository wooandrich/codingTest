import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList();
        
        for (int i=1;i<=n;i+=2) arr.add(i);
        return arr.stream().mapToInt(x -> x).toArray();
    }
}