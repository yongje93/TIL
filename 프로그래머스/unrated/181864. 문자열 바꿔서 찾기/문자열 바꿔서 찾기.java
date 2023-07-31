class Solution {
    public int solution(String myString, String pat) {
        String text = "";
        String[] splited = myString.split("");
        
        for (String s : splited) {
            if ("A".equals(s)) {
                text += "B";
            } else {
                text += "A";
            }
        }
        
        return text.contains(pat) ? 1 : 0;
    }
}