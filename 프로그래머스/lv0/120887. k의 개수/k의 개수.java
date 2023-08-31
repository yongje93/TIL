class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        
        String check = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(check)) {
                String[] array = value.split("");
                for (String alpha : array) {
                    if (alpha.equals(check)) count++;
                }
            }
        }
        return count;
    }
}