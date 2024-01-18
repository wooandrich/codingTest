class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int a = 0;
        int b = 0;

        loop1: for(int i = 0;i<words.length;i++){
            for(int j = 0; j<i; j++){
                if(words[i].equals(words[j])){
                    a = (i%n) + 1;
                    b = (i/n) + 1;
                    break loop1;
                }
            }
            if(i > 0 &&
              words[i-1].charAt(words[i-1].length() - 1) != 
               words[i].charAt(0)
              ){
                a = (i%n) + 1;
                b = (i/n) + 1;
                break;
            }
        }
        
        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}