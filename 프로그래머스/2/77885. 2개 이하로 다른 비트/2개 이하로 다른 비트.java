class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        int idx = 0;
        for (long n : numbers) {
            String binaryNum = Long.toBinaryString(n);
            int zeroIdx = binaryNum.lastIndexOf("0");
            
            if (zeroIdx != -1) {
                if (zeroIdx == binaryNum.length() - 1) {
                    answer[idx++] = Long.parseLong(binaryNum, 2) + 1;
                } else {
                    binaryNum = binaryNum.substring(0, zeroIdx) + "10" + 
                                binaryNum.substring(zeroIdx + 2, binaryNum.length());
                    answer[idx++] = Long.parseLong(binaryNum, 2);
                }
            } else {
                binaryNum = "10" + binaryNum.substring(1, binaryNum.length());
                answer[idx++] = Long.parseLong(binaryNum, 2);
            }
        }
        
        return answer;
    }
}