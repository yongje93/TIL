import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /=  2;
            } else {
                n =  3 * n + 1;
            }
            list.add(n);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}