// CSC103 Lecture 13: String processing
// Teaching example for Dr. Muhammad Farhan
public class Lecture13 {
  public static void main(String[] args) throws Exception {
    String code = "CS-103";
    String prefix = code.substring(0, 2);
    int number = Integer.parseInt(code.substring(3));
    System.out.println(prefix);
    System.out.println(number + 1);
  }
  
}
