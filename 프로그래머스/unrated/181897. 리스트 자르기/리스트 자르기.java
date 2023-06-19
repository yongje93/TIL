import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {            
        int start = (n == 1 ? 0 : slicer[0]);
        int end = (n == 2 ? num_list.length - 1 : slicer[1]);
        int step = (n == 4 ? slicer[2] : 1);
        
        List<Integer> list = new ArrayList<>();  
        for (int i = start; i <= end; i+= step) {
            list.add(num_list[i]);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}