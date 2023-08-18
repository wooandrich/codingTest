import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};

        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);
        BigInteger gcd = a.gcd(b);

        answer = new int[2];

        answer[0] = gcd.intValue();
        answer[1] = n * m / answer[0];

        return answer;
    }
}