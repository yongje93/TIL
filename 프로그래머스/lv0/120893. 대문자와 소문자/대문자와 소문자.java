class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_arr = my_string.toCharArray();
        
        for (int i = 0; i < my_arr.length; i++) {
            if (65 <= my_arr[i] && my_arr[i] <= 90) {
                my_arr[i] = (char) (my_arr[i] + 32);
            } else if (97 <= my_arr[i] && my_arr[i] <= 122) {
                my_arr[i] = (char) (my_arr[i] - 32);
            }
        }
        return String.valueOf(my_arr);
    }
}