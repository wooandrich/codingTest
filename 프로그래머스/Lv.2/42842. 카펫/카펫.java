class Solution {
    public int[] solution(int brown, int yellow) {
    
        int width = 0;
        int height = 0;

        int plus = brown + yellow;

        int[] answer = new int[2];

        for (int i = 3; i <= plus; i++) {
            if (plus % i == 0) {
                width = i;
                height = plus / i;

                if (width >= height && height >= 3) {
                    if ((width - 2) * (height - 2) == yellow) {
                        answer[0] = width;
                        answer[1] = height;
                        break;
                    }
                }
            }
            
        }

        answer[0] = width;
        answer[1] = height;
        
        
        return answer;
    }
}