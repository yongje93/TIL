class Solution {
    public int solution(String[] orders) {
        int answer = 0;
        for (String order : orders) {
            if (order.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}