import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> arr = new ArrayList<>();
        
        if (cacheSize == 0) return cities.length * 5;
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (arr.contains(city)) {
                arr.remove(city);
                arr.add(city);
                answer += 1;
            } else {
                if (arr.size() == cacheSize) {
                    arr.remove(0);
                    arr.add(city);
                    answer += 5;
                } else {
                    arr.add(city);
                    answer += 5;
                }
            }
        }
        
        return answer;
    }
}