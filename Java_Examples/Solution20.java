public class Solution20 {
  public static void main(String[] args) throws Exception {
    int[] values = {-4, -9, -2};
    System.out.println(maximum(values));
  }
  static int maximum(int[] values) {
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
