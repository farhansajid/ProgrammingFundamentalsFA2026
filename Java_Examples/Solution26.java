public class Solution26 {
  public static void main(String[] args) throws Exception {
    System.out.println(max(new int[]{-4, -2, -9}));
    try {
      max(new int[]{});
    } catch (IllegalArgumentException ex) {
      System.out.println("Empty array rejected");
    }
  }
  static int max(int[] values) {
    if (values == null || values.length == 0) {
      throw new IllegalArgumentException("nonempty array required");
    }
    int maximum = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > maximum) maximum = values[i];
    }
    return maximum;
  }
}
