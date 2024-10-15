class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] dart = new int[3];
        
        int n = 0;
        int idx = 0;
        String numStr = "";
        
        for (int i=0;i<dartResult.length();i++) {
            char c = dartResult.charAt(i);
            
            // 숫자일때
            if (c >= '0' && c <= '9') {
                numStr += String.valueOf(c);
            } 
            // 보너스일때
            else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(numStr);
                
                if (c == 'S') {
                    dart[idx++] = (int)Math.pow(n,1);
                }
                else if (c == 'D') {
                    dart[idx++] = (int)Math.pow(n,2);
                } else {
                    dart[idx++] = (int)Math.pow(n,3);
                }
                numStr = "";
            }
            // 보너스일때
            else {
                if (c == '*') {
                    dart[idx-1] *= 2;
                    if (idx - 2 >= 0) dart[idx-2] *= 2;
                } else{
                    dart[idx-1] *= -1;
                }
            }
            
            
        }
        answer = dart[0] + dart[1] + dart[2];
        
        
        
        
        
        
        return answer;
    }
}