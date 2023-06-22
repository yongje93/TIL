class Solution {
    public String solution(String rny_string) {
        return rny_string.contains("m") ? rny_string.replaceAll("m", "rn") : rny_string;
    }
}