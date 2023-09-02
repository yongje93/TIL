class Solution {
    public String solution(String my_string, int m, int c) {
        if (m == 1) return my_string;
        String answer = "";
        int idx = 0;
        for (int i = 0; i < my_string.length()/m; i++) {
            for (int j = 0; j < m; j++) {
                if (j == c - 1) {
                    answer += my_string.charAt(idx++);
                } else {
                    idx++;
                }
            }
        }
        
        return answer;
    }
}