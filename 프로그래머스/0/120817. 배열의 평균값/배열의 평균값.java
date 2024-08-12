class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int a : numbers) answer += a;
        
        return answer / numbers.length;
    }
}