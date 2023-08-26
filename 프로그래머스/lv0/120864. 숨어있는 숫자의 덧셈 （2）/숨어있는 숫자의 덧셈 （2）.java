class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] numbers = my_string.split("[a-zA-Z]");
        for (String num : numbers) {
            if (!num.isEmpty()) { 
                answer += Integer.parseInt(num);
            }
        }
        return answer;
    }
}