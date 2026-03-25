import java.util.*;

class Solution {
    static int answer;
    static String numbers;
    static boolean[] check;
    static Set<Integer> set;
    
    public int solution(String numbers) {
        this.numbers = numbers;
        answer = 0;
        check = new boolean[numbers.length()];
        set = new HashSet<>();
        
        solve("");
        
        for (int n : set) {
            if (isPrime(n)) answer++;
        }
        
        
        return answer;
    }
    
    void solve(String number) {
        //System.out.println(number);
        if (!number.isEmpty()) set.add(Integer.parseInt(number));
        
        if (number.length() == numbers.length()) return;
        
        for (int i=0;i<numbers.length();i++) {
            if (!check[i]) {
                check[i] = true;
                solve(number + numbers.charAt(i));
                check[i] = false;
            }
        }
        
    }
    
    boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 2) return false;
        
        for (int i=2;i*i <=num;i++) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}