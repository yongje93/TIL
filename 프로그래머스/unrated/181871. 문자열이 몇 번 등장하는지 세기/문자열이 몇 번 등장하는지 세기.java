class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int my_len = myString.length();
        int pat_len = pat.length();
        
        for (int i = 0; i <= my_len - pat_len; i++) {
            if (myString.substring(i, i + pat_len).equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}