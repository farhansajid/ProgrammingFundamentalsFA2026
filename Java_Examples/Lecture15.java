// CSC103 Lecture 15: User-defined methods
// Teaching example for Dr. Muhammad Farhan
public class Lecture15 {
  public static void main(String[] args) throws Exception {
    int result = rectangleArea(5, 3);
    System.out.println(result);
  }
  static int rectangleArea(int width, int height) {
    return width * height;
  }
}
