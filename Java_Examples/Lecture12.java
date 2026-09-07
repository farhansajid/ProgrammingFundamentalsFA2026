// CSC103 Lecture 12: References and string input
// Teaching example for Dr. Muhammad Farhan
public class Lecture12 {
  public static void main(String[] args) throws Exception {
    String first = "CS";
    String second = first;
    first = first + "C103";
    System.out.println(first);
    System.out.println(second);
  }
  
}
