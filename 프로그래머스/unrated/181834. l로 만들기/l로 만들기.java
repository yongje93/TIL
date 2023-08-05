class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (c < 108) {
                answer += "l";
            } else {
                answer += String.valueOf(c);
            }
        }
        return answer;
    }
}