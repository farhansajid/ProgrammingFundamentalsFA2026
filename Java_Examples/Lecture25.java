// CSC103 Lecture 25: Cleanup and exception propagation
// Teaching example for Dr. Muhammad Farhan
public class Lecture25 {
  public static void main(String[] args) throws Exception {
    try {
      readCount("bad");
    } catch (IllegalArgumentException ex) {
      System.out.println(ex.getMessage());
      System.out.println(ex.getCause().getClass().getSimpleName());
    } finally {
      System.out.println("Cleanup");
    }
  }
  static int readCount(String text) {
    try { return Integer.parseInt(text); }
    catch (NumberFormatException ex) {
      throw new IllegalArgumentException("Invalid record count", ex);
    }
  }
}
