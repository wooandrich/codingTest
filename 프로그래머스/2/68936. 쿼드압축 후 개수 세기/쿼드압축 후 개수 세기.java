class Solution {
    static int n;
    static int[] answer;
    static int[][] arr;
    
    public int[] solution(int[][] arr) {
        this.arr = arr;
        answer = new int[2];
        
        n = arr.length;
        
        solve(0, 0, n);
        
        return answer;
    }
    
    void solve(int y, int x, int size) {
        int value = arr[y][x];
        if (size == 1) {
            answer[value]++;
            return;
        }
        
        boolean isTrue = true;
        
        for (int i=y;i<y+size;i++) {
            for (int j=x;j<x+size;j++) {
                if (value != arr[i][j]) {
                    isTrue = false;
                    break;
                }
            }
            if (!isTrue) break;
        }
        
        if (isTrue) {
            answer[value]++;
            return;
        }
        
        // 1분면
        solve(y, x, size / 2);
        
        // 2분면
        solve(y, x + size / 2, size / 2);
        
        // 3분면
        solve(y + size / 2, x, size / 2);
        
        // 4분면
        solve(y + size / 2, x + size / 2, size / 2);
        
    }
}