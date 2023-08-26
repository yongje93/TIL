class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] splited = s.split(" ");

        for (int i = 0; i < splited.length; i++) {
            if ("Z".equals(splited[i])) {                
                answer -= Integer.parseInt(splited[i - 1]);
            } else {
                answer += Integer.parseInt(splited[i]);
            }
        }
        return answer;
    }
}