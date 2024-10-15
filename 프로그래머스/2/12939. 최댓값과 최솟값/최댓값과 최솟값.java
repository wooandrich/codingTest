class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String str : arr) {
            int temp = Integer.parseInt(str);
            
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        
        return answer;
    }
}