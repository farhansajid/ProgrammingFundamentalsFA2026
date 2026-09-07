public class Solution17 {
  public static void main(String[] args) throws Exception {
    int result = max(max(4, 9), 7);
    System.out.println(result);
    System.out.println(max(max(7, 7), 3));
  }
  static int max(int a, int b) {
    return a >= b ? a : b;
  }
}
