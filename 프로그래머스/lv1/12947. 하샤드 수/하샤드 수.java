class Solution {
  public boolean solution(int x) {
      String[] array = String.valueOf(x).split("");
      int sum = 0;
      for (String s : array) {
          sum += Integer.parseInt(s);
      }
      return (x % sum == 0) ? true : false;
  }
}