class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        return min + " " + max;
    }
}