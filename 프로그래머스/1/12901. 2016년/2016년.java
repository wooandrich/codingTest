class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int cnt = 3;
        boolean flag = false;
        for (int i = 1;i<=12;i++){
            for (int j=1;j<=31;j++){
                if (i == 2) {
                    if (j > 29) break;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    if (j > 30) break;
                }
                cnt = (cnt + 1) % 7;
                if (i == a && j == b) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        if (cnt == 0) answer= "MON";
        else if (cnt == 1) answer= "TUE";
        else if (cnt == 2) answer= "WED";
        else if (cnt == 3) answer= "THU";
        else if (cnt == 4) answer= "FRI";
        else if (cnt == 5) answer= "SAT";
        else if (cnt == 6) answer= "SUN";
        
        return answer;
    }
}