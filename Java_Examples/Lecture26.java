// CSC103 Lecture 26: Programming environments and debugging
// Teaching example for Dr. Muhammad Farhan
public class Lecture26 {
  public static void main(String[] args) throws Exception {
    int[] values = {-4, -2, -9};
    int maximum = values[0];
    for (int i = 1; i < values.length; i++) {
      if (values[i] > maximum) maximum = values[i];
    }
    System.out.println(maximum);
  }
  
}
