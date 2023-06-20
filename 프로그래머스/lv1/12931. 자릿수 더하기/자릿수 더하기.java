import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
		    
        String temp = n + "";
        String[] numbers = temp.split("");
        for (String number : numbers) {
            answer += Integer.parseInt(number);
        }
		
		return answer;
    }
}