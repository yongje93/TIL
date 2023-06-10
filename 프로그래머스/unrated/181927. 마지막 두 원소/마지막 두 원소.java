class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int size = num_list.length;
        for (int i = 0; i < answer.length; i++) {
            if (i == size) {
                int last = num_list[size - 1];
                int behind = num_list[size - 2];                
                answer[i] = last > behind ? last - behind : last * 2;
            } else {
               answer[i] = num_list[i];
            }
        }
        
        return answer;
    }
}