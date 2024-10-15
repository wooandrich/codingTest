class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int w_x = wallet[0];
        int w_y = wallet[1];
        
        int x = Math.max(bill[0], bill[1]);
        int y = Math.min(bill[0], bill[1]);
        
        if (half(w_x,w_y,x,y)) return answer;
        
        while (true) {
            if (x >= y) {
                x /= 2;
            } else {
                y /= 2;
            }
            
            answer++;
            
            if (half(w_x,w_y,x,y)) break;
        }
        
        
        
        return answer;
    }
    public boolean half(int w_x, int w_y, int x, int y) {
        if (w_x >= x && w_y >= y) return true;
        
        if (w_x >= y && w_y >= x) return true;
        
        return false;
    }
}