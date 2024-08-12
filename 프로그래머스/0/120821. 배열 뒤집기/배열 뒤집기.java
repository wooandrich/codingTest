import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> arr = Arrays.stream(num_list)
            .boxed()
            .collect(Collectors.toList());
        
        Collections.reverse(arr);
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}