import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
		    
        String[] numbers = String.valueOf(n).split("");
        for (String number : numbers) {
            answer += Integer.parseInt(number);
        }
		
		return answer;
    }
}