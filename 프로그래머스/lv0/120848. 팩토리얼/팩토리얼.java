class Solution {
    public int solution(int n) {
        int answer = 1;
        int check = 1;
        int i = 2;

        while (check <= n) {
            check *= i;
            answer = i;
            i++;
        }

        return answer - 1;
    }
}