import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        String[] splited = myStr.split("(a|b|c)");
        
        for (String str : splited) {
            if (str.length() > 0) {
                answer.add(str);
            }
        }
        
        if (answer.size() == 0) {
            return new String[]{"EMPTY"};
        } else {
            return answer.toArray(new String[0]);   
        }
    }
}