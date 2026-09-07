public class Solution27 {
  public static void main(String[] args) throws Exception {
    int[] original = {9, 1, 4};
    int[] sorted = java.util.Arrays.copyOf(original, original.length);
    java.util.Arrays.sort(sorted);
    int index = java.util.Arrays.binarySearch(sorted, 4);
    System.out.println(java.util.Arrays.toString(sorted));
    System.out.println(index);
    System.out.println(java.util.Arrays.toString(original));
  }
}
