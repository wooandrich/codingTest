import java.util.*;
class Solution {
    static List<String> arr;
    static String[] temp = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        arr = new ArrayList<>();
        
        dfs("", 0);
        
        for (int i=0;i<arr.size();i++){
            if (word.equals(arr.get(i))) {
                answer = i;
                break;
            }
        }
        
        
        
        return answer;
    }
    public void dfs(String str, int len){
        arr.add(str);
        if (len == 5) return;
        
        for (int i=0;i<5;i++){
            dfs(str + temp[i], len + 1);
        }
    }
}