class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            String numStr = String.valueOf(num);
            for (char c : numStr.toCharArray()) {
                if ('7' == c) answer++;
            }
        }
        return answer;
    }
}