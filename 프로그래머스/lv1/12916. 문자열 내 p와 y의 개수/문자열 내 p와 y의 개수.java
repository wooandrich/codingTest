class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int ans = 0;
        String st = s.toLowerCase();

        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == 'p') ans +=1;
            else if (st.charAt(i) == 'y') ans -=1;
        }
        if (ans != 0) answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}