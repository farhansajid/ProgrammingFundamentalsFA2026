// CSC103 Lecture 31: Unit testing with JUnit
// Teaching example for Dr. Muhammad Farhan
public class Lecture31 {
  public static void main(String[] args) throws Exception {
    int result = max(-4, -2);
    if (result != -2) throw new AssertionError("negative pair");
    System.out.println("Unit behaviour passed");
  }
  static int max(int a, int b) { return a >= b ? a : b; }
}
