class Solution {
    public int solution(int[][] sizes) {
        int answer = sizes[0][0] * sizes[0][1];
        int x = sizes[0][0];
        int y = sizes[0][1];
        
        for(int i=1;i<sizes.length;i++){
            int x1 = Math.max(x, sizes[i][0]);
            int x2 = Math.max(y, sizes[i][0]);
            
            int y1 = Math.max(y, sizes[i][1]);
            int y2 = Math.max(x, sizes[i][1]);
            
            if(x1 + y1 <= x2 + y2){
                x = x1;
                y = y1;
                answer = x * y;
            }else{
                x = x2;
                y = y2;
                answer = x * y;
            }
        }
       
        return answer;
    }
}