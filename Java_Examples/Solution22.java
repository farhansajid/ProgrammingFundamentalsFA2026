public class Solution22 {
  public static void main(String[] args) throws Exception {
    int[][] data = {{2, 4}, {6, 8}};
    int total = 0;
    for (int[] row : data) {
      for (int value : row) total += value;
    }
    int diagonal = 0;
    for (int i = 0; i < data.length; i++) {
      diagonal += data[i][i];
    }
    System.out.println("Total: " + total);
    System.out.println("Diagonal: " + diagonal);
  }
}
