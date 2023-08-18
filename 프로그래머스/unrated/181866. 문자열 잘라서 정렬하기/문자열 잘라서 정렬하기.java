import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] splited = myString.split("x");
        List<String> list = new ArrayList<>();
        for (String s : splited) {
            if (s.equals("")) {
                continue;
            }
            list.add(s);
        }
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }
}