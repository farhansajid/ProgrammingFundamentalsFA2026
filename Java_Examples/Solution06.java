public class Solution06 {
  public static void main(String[] args) throws Exception {
    double pen = 25.5;
    double book = 120.0;
    System.out.printf(java.util.Locale.US, "%-8s %8.2f%n", "Pen", pen);
    System.out.printf(java.util.Locale.US, "%-8s %8.2f%n", "Book", book);
    System.out.printf(java.util.Locale.US, "%-8s %8.2f%n", "Total", pen + book);
  }
}
