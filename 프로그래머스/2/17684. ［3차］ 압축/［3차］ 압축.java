import java.util.*;
class Solution {
    public int[] solution(String msg) {

        List<String> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<26;i++){
            arr.add(String.valueOf((char)('A' + i)));
        }
        
        for (int i=0;i<msg.length();i++){
            for (int j = arr.size() - 1;j>=0;j--){
                if (msg.substring(i).startsWith(arr.get(j))) {
                    i += arr.get(j).length() - 1;
                    result.add(j + 1);
                    if (i+1 < msg.length()) {
                        arr.add(arr.get(j) + msg.charAt(i + 1));
                    }
                    break;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        
        for (int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        
        
        
        
        return answer;
    }
}