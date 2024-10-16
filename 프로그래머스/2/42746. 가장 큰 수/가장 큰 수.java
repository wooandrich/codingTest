import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        String[] arr = new String[numbers.length];
        
        for (int i=0;i<numbers.length;i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (s1,s2) -> (s2+s1).compareTo(s1+s2));
        
        if (arr[0].equals("0")) return "0";
        
        for (String s : arr){
            sb.append(s);
        }
        
        
        return sb.toString();
    }
    
}