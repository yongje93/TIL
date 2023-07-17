import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            set.add(String.valueOf(c));
        }
        answer = String.join("", set);
        return answer;
    }
}