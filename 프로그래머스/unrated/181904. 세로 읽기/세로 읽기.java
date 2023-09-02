class Solution {
    public String solution(String my_string, int m, int c) {
        if (m == 1) {
            return my_string;
        }
        String answer = "";
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}