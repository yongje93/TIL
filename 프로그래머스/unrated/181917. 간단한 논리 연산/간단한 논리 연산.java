class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean left = (x1 || x2) ? true : false;
        boolean right = (x3 || x4) ? true : false;
        answer = (left && right) ? true : false;
        
        return ((x1 || x2) && (x3 || x4));
    }
}