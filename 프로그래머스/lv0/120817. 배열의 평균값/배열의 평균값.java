class Solution {
    public double solution(int[] numbers) {
        int total = 0;
        double answer = 0;
        for (int number : numbers) {
            total += number;
        }
        answer = (double) total / numbers.length;
        return answer;
    }
}