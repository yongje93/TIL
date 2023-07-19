class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] split = num_str.split("");
        for (String num : split) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}