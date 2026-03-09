import java.util.*;

class Solution {
    
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    
    public int solution(String dirs) {
        int answer = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('U', 0);
        map.put('D', 1);
        map.put('L', 2);
        map.put('R', 3);
        
        Set<String> set = new HashSet<>();
        
        int[][] arr = new int[11][11];
        
        int y = 5;
        int x = 5;
        
        arr[y][x] = 1;
        
        for (char c : dirs.toCharArray() ) {
            int dir = map.get(c);
            
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            
            if (ny < 0 || ny > 10 || nx < 0 || nx > 10) continue;
            
            String path1 = y + "," + x + "->" + ny + "," + nx;
            String path2 = ny + "," + nx + "->" + y + "," + x;
            
            y = ny;
            x = nx;
            
            set.add(path1);
            set.add(path2);
        }
        
        
        return set.size() / 2;
    }
}