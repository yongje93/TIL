class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (String[] data : db) {
            if (id_pw[0].equals(data[0])) {
                if (id_pw[1].equals(data[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}