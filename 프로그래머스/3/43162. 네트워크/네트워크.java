import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        List<Integer>[] graph = new ArrayList[n];
        
        for (int i=0;i<n;i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                graph[i].add(computers[i][j]);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        for (int i =0;i<n;i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;
                answer++;
            }
            
            while (!q.isEmpty()) {
                int v = q.poll();
                
                for (int j = 0;j<n;j++) {
                    if (v == j) continue;
                    
                    if (!visited[j] && graph[v].get(j) == 1) {
                        q.add(j);
                        visited[j] = true;
                    }   
                }
            }
        }
        
        
        return answer;
    }
}