// CSC103 Lecture 24: Exception handling
// Teaching example for Dr. Muhammad Farhan
public class Lecture24 {
  public static void main(String[] args) throws Exception {
    try {
      int marks = Integer.parseInt("bad");
      System.out.println(marks);
    } catch (NumberFormatException ex) {
      System.out.println("Invalid integer");
    }
    System.out.println("Finished");
  }
  
}
