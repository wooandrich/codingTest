import java.util.*;

class Solution {
    static class Song {
        String genres;
        int plays;
        int idx;
        
        Song(String genres, int plays, int idx) {
            this.genres = genres;
            this.plays = plays;
            this.idx = idx;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> one = new HashMap<>();
        List<Song> song = new ArrayList<>();
        Map<String, Integer> cnt = new HashMap<>();
        
        for (String g : genres) {
            set.add(g);
        }
        
        for (String g : genres) {
             map.merge(g, 1, Integer::sum);
        }
        
        int size = 0;
        for (String g : set) {
            if (map.get(g) == 1) size++;
            else size += 2;
        }
        
        int[] answer = new int[size];
        
        for (int i=0;i<genres.length;i++) {
            one.merge(genres[i], plays[i], Integer::sum);
            
            song.add(new Song(genres[i], plays[i], i));
        }
        
        Collections.sort(song, (a, b) -> {
            if (!one.get(b.genres).equals(one.get(a.genres))) {
                return one.get(b.genres) - one.get(a.genres);
            }
            
            if (b.plays != a.plays) return b.plays - a.plays;
            
            return a.idx - b.idx;
        });
        
        int i = 0;
        for (Song s : song) {
             if (cnt.getOrDefault(s.genres, 0) < 2) {
                 answer[i++] = s.idx;
                 cnt.merge(s.genres, 1, Integer::sum);
             }
            
        }
        
        
        
        return answer;
    }
}