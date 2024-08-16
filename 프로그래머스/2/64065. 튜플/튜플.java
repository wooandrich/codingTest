import java.util.*;
class Solution {
    public int[] solution(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] answer = {};
        s = s.substring(2, s.length()-2).replace("},{", "-");
        String[] a = s.split("-");
        Arrays.sort(a, new Comparator<String>(){
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for (String x : a) {
            String[] list = x.split(",");
            
            for (String y : list) {
                int temp = Integer.parseInt(y);
                if (!ans.contains(temp)) ans.add(temp);
            }
        }
        
        return ans.stream().mapToInt(x -> x).toArray();
    }
}