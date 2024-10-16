class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        recur(0, 0, numbers, target);
        return answer;
    }
    public void recur(int idx,int num, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (num == target) {
                answer++;
            }
            return;
            
        }
        recur(idx + 1, num - numbers[idx], numbers, target);
        recur(idx + 1, num + numbers[idx], numbers, target);
        
    }
}