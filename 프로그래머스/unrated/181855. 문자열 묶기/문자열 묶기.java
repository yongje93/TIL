import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        int maxFrequency = Collections.max(map.values());
        return maxFrequency;
    }
}