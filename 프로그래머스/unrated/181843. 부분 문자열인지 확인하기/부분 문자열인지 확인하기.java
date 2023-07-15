class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int size = target.length();
        
        for (int i = 0; i < my_string.length() - size + 1; i++) {
            String sub = my_string.substring(i, i + size);
            if (sub.equals(target)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}