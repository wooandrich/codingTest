class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        int start = phone_number.length() - 4;

        for (int i = 0; i < start; i++) {
            answer.append("*");
        }

        for (int i = start; i < phone_number.length(); i++) {
            answer.append(phone_number.charAt(i));
        }

        return answer.toString();
    }
}