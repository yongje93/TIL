class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            if (c == (char) k + '0') {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}