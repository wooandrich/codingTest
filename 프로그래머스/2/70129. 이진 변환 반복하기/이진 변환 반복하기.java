class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (true) {
            int cnt = s.length();
            s = s.replace("0","");
            int c = s.length();
            
            answer[0]++;
            answer[1] += cnt - c;
            
            
            s = Integer.toString(c, 2);

            if (s.equals("1")) break;

        }
        
        
        return answer;
    }
}