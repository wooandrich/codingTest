class Solution {
    public int solution(int n) {
        int answer = n+1;


        while (true) {
            String s = Integer.toBinaryString(n);
            int nSize = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') nSize++;
            }

            String s2 = Integer.toBinaryString(answer);
            int aSize = 0;

            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == '1') aSize++;
            }

            if (nSize == aSize) {
                return answer;
            } else {
                answer++;
            }
        }

    }
}