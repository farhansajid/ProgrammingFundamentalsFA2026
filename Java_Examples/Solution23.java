public class Solution23 {
  public static void main(String[] args) throws Exception {
    int[][] values = {{1}, {2, 3}, {}};
    System.out.println(elementCount(values));
  }
  static int elementCount(int[][] values) {
    int count = 0;
    for (int[] row : values) {
      count += row.length;
    }
    return count;
  }
}
