import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] frontArr = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] backArr = Arrays.copyOfRange(num_list, 0, n);
        
        int idx = 0;
        for (int front : frontArr) {
            answer[idx++] = front;
        }
        for (int back : backArr) {
            answer[idx++] = back;
        }
        
        return answer;
    }
}