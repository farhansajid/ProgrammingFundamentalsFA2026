// CSC103 Lecture 19: Recursion and backtracking
// Teaching example for Dr. Muhammad Farhan
public class Lecture19 {
  public static void main(String[] args) throws Exception {
    System.out.println(sumTo(4));
    binary("", 2);
  }
  static int sumTo(int n) {
    if (n < 0) throw new IllegalArgumentException("negative n");
    if (n == 0) return 0;
    return n + sumTo(n - 1);
  }
  static void binary(String prefix, int remaining) {
    if (remaining == 0) { System.out.println(prefix); return; }
    binary(prefix + "0", remaining - 1);
    binary(prefix + "1", remaining - 1);
  }
}
