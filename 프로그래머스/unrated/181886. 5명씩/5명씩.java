import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        result.add(names[0]);
        for (int i = 5; i < names.length; i+=5) {
            result.add(names[i]);
        }
        return result.stream().toArray(String[]::new);
    }
}