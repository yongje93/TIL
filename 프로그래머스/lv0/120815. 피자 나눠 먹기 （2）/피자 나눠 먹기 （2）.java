class Solution {
    public int solution(int n) {
        int pizza = 6;
        while (true) {
            if (pizza % n == 0) break;
            pizza += 6;
        }
        return pizza / 6;
    }
}