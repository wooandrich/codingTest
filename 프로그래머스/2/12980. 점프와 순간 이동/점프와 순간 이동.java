import java.util.*;

class Solution {
    public int solution(int n) {
        int ret = 0;

        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else {
                n -= 1;
                ret++;
            }
        }


        return ret + 1;
    }
}