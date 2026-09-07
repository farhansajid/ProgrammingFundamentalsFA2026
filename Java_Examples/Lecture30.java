// CSC103 Lecture 30: Test harnesses
// Teaching example for Dr. Muhammad Farhan
public class Lecture30 {
  public static void main(String[] args) throws Exception {
    int[][] cases = {{2, 5, 5}, {-4, -2, -2}, {3, 3, 3}};
    int passed = 0;
    for (int[] c : cases) {
      int actual = max(c[0], c[1]);
      if (actual == c[2]) passed++;
      else System.out.println("FAIL expected " + c[2] + " got " + actual);
    }
    System.out.println("Passed " + passed + "/" + cases.length);
  }
  static int max(int a, int b) { return a >= b ? a : b; }
}
