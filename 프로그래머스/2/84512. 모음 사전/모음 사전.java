import java.util.*;

class Solution {
    
    static char[] wordList = {'A', 'E', 'I', 'O', 'U'};
    static int answer;
    static List<String> arr = new ArrayList<>();
    public int solution(String word) {
        answer = 0;
        
        solve("");
        
        Collections.sort(arr);
        answer = arr.indexOf(word);
        
        
        return answer + 1;
    }
    
    static void solve(String nowWord) {
        
        if (nowWord.length() == 5) return;
        
        for (int i=0;i<wordList.length;i++) {
            String nextWord = nowWord + wordList[i];
            arr.add(nextWord);
            solve(nextWord);
        }
    }
}