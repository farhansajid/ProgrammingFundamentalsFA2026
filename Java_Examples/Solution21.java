public class Solution21 {
  public static void main(String[] args) throws Exception {
    int[] original = {2, 3};
    int[] result = doubled(original);
    System.out.println(java.util.Arrays.toString(result));
    System.out.println(java.util.Arrays.toString(original));
  }
  static int[] doubled(int[] input) {
    int[] output = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      output[i] = input[i] * 2;
    }
    return output;
  }
}
