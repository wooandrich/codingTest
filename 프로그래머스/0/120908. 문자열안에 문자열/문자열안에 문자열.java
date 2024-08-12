class Solution {
    public int solution(String str1, String str2) {
        int length = str2.length();
        int answer = 0;
        
        for (int i=0;i<str1.length() - length + 1;i++){
            String temp = str1.substring(i,i+length);

            if (temp.equals(str2)) {
                answer++;
                break;
            }
        }
        
        
        
        
        return answer == 1 ? 1 : 2;
    }
}