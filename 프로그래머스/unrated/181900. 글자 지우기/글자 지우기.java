class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] splited = my_string.split("");
        for (int index : indices) {
            splited[index] = "";
        }
        
        for (String str : splited) {
            answer += str;
        }
        
        return answer;
    }
}