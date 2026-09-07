public class Solution19 {
  public static void main(String[] args) throws Exception {
    System.out.println(factorial(4));
    System.out.println(factorial(0));
  }
  static int factorial(int n) {
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException("n must be in 0..12");
    }
    if (n == 0) return 1;
    return n * factorial(n - 1);
  }
}
