// CSC103 Lecture 7: Boolean expressions
// Teaching example for Dr. Muhammad Farhan
public class Lecture07 {
  public static void main(String[] args) throws Exception {
    int marks = 50;
    boolean valid = marks >= 0 && marks <= 100;
    boolean passed = valid && marks >= 50;
    System.out.println(valid);
    System.out.println(passed);
  }
  
}
