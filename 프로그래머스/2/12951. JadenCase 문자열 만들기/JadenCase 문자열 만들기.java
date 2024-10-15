class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        
        for (String str : arr){
            if (str.length() == 0) answer += " ";
            else {
                answer += str.substring(0, 1).toUpperCase();
                answer += str.substring(1, str.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if (s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        else return answer.substring(0, answer.length()-1);
    }
}