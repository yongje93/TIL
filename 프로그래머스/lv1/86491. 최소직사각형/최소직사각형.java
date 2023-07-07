import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[][] sizes) {
        List<Integer> width = new ArrayList<>();
        List<Integer> height = new ArrayList<>();

        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                width.add(size[1]);
                height.add(size[0]);
            } else {
                width.add(size[0]);
                height.add(size[1]);
            }
        }

        return Collections.max(width) * Collections.max(height);
    }
}