public class Solution31 {
  public static void main(String[] args) throws Exception {
    org.junit.jupiter.api.Assertions.assertThrows(
        IllegalArgumentException.class, () -> validateMark(101));
    org.junit.jupiter.api.Assertions.assertDoesNotThrow(
        () -> validateMark(100));
    System.out.println("2 checks passed");
  }
  static void validateMark(int mark) {
    if (mark < 0 || mark > 100) {
      throw new IllegalArgumentException("mark outside 0..100");
    }
  }
}
