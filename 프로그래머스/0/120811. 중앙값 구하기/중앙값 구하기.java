import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int idx = (array.length - 1) / 2;
        int answer = 0;
        return array[idx];
    }
}