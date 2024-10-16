import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        
        
        
        q.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while (!q.isEmpty()) {
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];
            int cnt = node[2];
            
            if (x == n-1 && y == m-1) {
                return cnt;
            }
            
            for (int i=0;i<4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        q.add(new int[]{nx,ny,cnt+1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        
        return answer;
    }
}