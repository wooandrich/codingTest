class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp = Integer.toString(n, k);
        
        String[] arr = temp.split("0");
        
        for (String data : arr){

            if (data.equals("")) continue;
            long num = Long.parseLong(data);
            if (isPrime(num)) answer++;
        }
        
        
        return answer;
    }
    public boolean isPrime(long num) {
        if (num < 2) return false;
        
        for (int i = 2; i<=Math.sqrt(num);i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}