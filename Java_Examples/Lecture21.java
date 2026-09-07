// CSC103 Lecture 21: Arrays and method arguments
// Teaching example for Dr. Muhammad Farhan
public class Lecture21 {
  public static void main(String[] args) throws Exception {
    int[] data = {1, 2};
    modify(data);
    System.out.println(data[0]);
    System.out.println(sum(2, 3, 4));
  }
  static void modify(int[] a) {
    a[0] = 9;
    a = new int[]{7};
  }
  static int sum(int... values) {
    int total = 0;
    for (int v : values) total += v;
    return total;
  }
}
