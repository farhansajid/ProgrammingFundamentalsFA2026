public class Solution25 {
  public static void main(String[] args) throws Exception {
    try {
      try {
        System.out.println("A");
        Integer.parseInt("bad");
      } catch (NumberFormatException ex) {
        System.out.println("B");
        throw ex;
      } finally {
        System.out.println("C");
      }
    } catch (NumberFormatException ex) {
      System.out.println("D");
    }
  }
}
