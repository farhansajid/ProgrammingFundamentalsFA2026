// CSC103 Lecture 22: Two-dimensional arrays
// Teaching example for Dr. Muhammad Farhan
public class Lecture22 {
  public static void main(String[] args) throws Exception {
    int[][] data = {{1, 2, 3}, {4, 5, 6}};
    for (int[] row : data) {
      int total = 0;
      for (int value : row) total += value;
      System.out.println(total);
    }
  }
  
}
