class Solution {
    public String solution(String s) {


        StringBuilder sb = new StringBuilder();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (str == ' ') {
                sb.append(str);
                count = 0;
                continue;
            }
            if (count % 2 == 0) {
                sb.append(Character.toUpperCase(str));
                count++;
            } else{
                sb.append(Character.toLowerCase(str));
                count++;
            }


        }

        return sb.toString();
    }
}