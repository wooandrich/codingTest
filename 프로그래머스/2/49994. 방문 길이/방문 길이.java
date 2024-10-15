import java.util.*;
class Solution {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    
    public int solution(String dirs) {
        int answer = 0;
        
        int[][] arr = new int[11][11];
        Set<List<Integer>> set = new HashSet<>();
        
        char[] str = dirs.toCharArray();
        
        int x = 5;
        int y = 5;
        
        
        for (char order : str) {
            int nx = 0;
            int ny = 0;
            if (order == 'U') {
                nx = x + dx[0];
                ny = y + dy[0];
            } else if (order == 'D') {
                nx = x + dx[1];
                ny = y + dy[1];
            } else if (order == 'R') {
                nx = x + dx[2];
                ny = y + dy[2];
            } else {
                nx = x + dx[3];
                ny = y + dy[3];
            }
            
            if (nx >= 0 && nx <= 10 && ny >= 0 && ny <= 10) {
                set.add(Arrays.asList(x,y,nx,ny));
                set.add(Arrays.asList(nx,ny,x,y));
                
                x = nx;
                y = ny;
            }
        }
        answer = set.size() / 2;
        
        return answer;
    }
}