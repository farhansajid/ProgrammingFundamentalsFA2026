// CSC103 Lecture 20: One-dimensional arrays
// Teaching example for Dr. Muhammad Farhan
public class Lecture20 {
  public static void main(String[] args) throws Exception {
    int[] marks = {60, 75, 90};
    int total = 0;
    for (int i = 0; i < marks.length; i++) {
      total += marks[i];
    }
    System.out.println((double) total / marks.length);
  }
  
}
