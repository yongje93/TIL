import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splited = s.split("");
        Arrays.sort(splited);
        
        Map<String, Integer> map = new LinkedHashMap<>();
        
        for (String num : splited) {
            map.put(num, map.getOrDefault(num,0) +1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        
        return answer;
    }
}