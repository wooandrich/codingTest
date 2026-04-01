import java.util.*;

class Solution {
    static int[] visited;
    
    public int solution(int n, int[][] edge) {
        Queue<Integer> q = new LinkedList<>();
        
        int answer = 0;
        int maxVal = 0;
        visited = new int[n];
        
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i=0;i<n;i++) graph.add(new ArrayList<>());
        
        for (int[] info : edge) {
            int a = info[0] - 1;
            int b = info[1] - 1;
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        q.add(0);
        visited[0] = 1;
        
        while(!q.isEmpty()) {
            int nowNode = q.poll();
            
            for (int node : graph.get(nowNode)) {
                if (visited[node] != 0) continue;
                
                q.add(node);
                visited[node] = visited[nowNode] + 1;
                maxVal = Math.max(maxVal, visited[node]);
            }
        }
        
        for (int i=0;i<n;i++) {
            if (maxVal == visited[i]) answer++;
        }
        
        
        return answer;
    }
}