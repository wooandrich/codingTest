class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int n = land.length - 1;

        for (int i=1;i<land.length;i++) {
            
            land[i][0] = Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]) + land[i][0];
            land[i][1] = Math.max(Math.max(land[i-1][2], land[i-1][3]), land[i-1][0]) + land[i][1];
            land[i][2] = Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]) + land[i][2];
            land[i][3] = Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]) + land[i][3];
        }
        answer = Math.max(Math.max(Math.max(land[n][0], land[n][1]), land[n][2]), land[n][3]);

        return answer;
    }
}