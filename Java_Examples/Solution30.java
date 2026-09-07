public class Solution30 {
  public static void main(String[] args) throws Exception {
    int[] inputs = {-5, 0, 5, Integer.MIN_VALUE};
    long[] expected = {5L, 0L, 5L, 2147483648L};
    for (int i = 0; i < inputs.length; i++) {
      long actual = absolute(inputs[i]);
      String status = actual == expected[i] ? "PASS" : "FAIL";
      System.out.println(status + " " + inputs[i] + " => " + actual);
    }
  }
  static long absolute(int value) {
    long widened = value;
    return widened < 0 ? -widened : widened;
  }
}
