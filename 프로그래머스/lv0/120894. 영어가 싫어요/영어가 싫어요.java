class Solution {
    public long solution(String numbers) {
        String[] stringOfNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < stringOfNum.length; i++) {
            numbers = numbers.replaceAll(stringOfNum[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}