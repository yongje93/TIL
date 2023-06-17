class Solution {
    public String solution(String my_string, int n) {
        int size = my_string.length();
        return my_string.substring(size - n, size);
    }
}