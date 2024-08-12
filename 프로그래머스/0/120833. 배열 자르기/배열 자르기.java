import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> arr = new ArrayList();
        for (int i=num1;i<=num2;i++) arr.add(numbers[i]);
        return arr.stream().mapToInt(x -> x).toArray();
    }
}