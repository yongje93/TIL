class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer += c - '0';
            }
        }
        return answer;
    }
}