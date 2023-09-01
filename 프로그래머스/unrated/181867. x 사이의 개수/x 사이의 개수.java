class Solution {
    public int[] solution(String myString) {
        String[] splited = myString.split("x", -1);
        int[] answer = new int[splited.length];
        int idx = 0;
        for (String num : splited) {
            answer[idx++] = num.length();
        }
        return answer;
    }
}