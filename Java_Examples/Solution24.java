public class Solution24 {
  public static void main(String[] args) throws Exception {
    int[] cases = {-1, 0, 100, 101};
    for (int mark : cases) {
      try {
        validateMark(mark);
        System.out.println(mark + " accepted");
      } catch (IllegalArgumentException ex) {
        System.out.println(mark + " rejected");
      }
    }
  }
  static void validateMark(int mark) {
    if (mark < 0 || mark > 100) {
      throw new IllegalArgumentException("marks outside 0..100");
    }
  }
}
