// CSC103 Lecture 23: Ragged and multidimensional arrays
// Teaching example for Dr. Muhammad Farhan
public class Lecture23 {
  public static void main(String[] args) throws Exception {
    int[][] data = {{1, 2}, {3}};
    System.out.println(total(data));
    int[][] copy = data.clone();
    copy[0][0] = 9;
    System.out.println(data[0][0]);
  }
  static int total(int[][] data) {
    int sum = 0;
    for (int[] row : data)
      for (int v : row) sum += v;
    return sum;
  }
}
