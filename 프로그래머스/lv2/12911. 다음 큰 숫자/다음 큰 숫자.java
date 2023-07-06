class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);
        
        while (true) {
            n++;
            int nextCount = Integer.bitCount(n);
            
            if (nextCount == count) break;
        }
        answer = n;
        return answer;
    }
}