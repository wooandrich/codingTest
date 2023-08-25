class Solution {
    public int solution(int n) {
        int answer = n+1;

        int nBit = Integer.bitCount(n);


        while (true) {
            int ansBit = Integer.bitCount(answer);

            if (ansBit == nBit) {
                return answer;
            } else {
                answer++;
            }
        }

    }
}