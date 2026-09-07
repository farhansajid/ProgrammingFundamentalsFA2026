// CSC103 Lecture 16: Parameters, stack and scope
// Teaching example for Dr. Muhammad Farhan
public class Lecture16 {
  public static void main(String[] args) throws Exception {
    int x = 5;
    change(x);
    System.out.println(x);
    System.out.println(twice(3));
    System.out.println(twice(3.0));
  }
  static void change(int n) { n = 99; }
  static int twice(int n) { return n * 2; }
  static double twice(double n) { return n * 2; }
}
