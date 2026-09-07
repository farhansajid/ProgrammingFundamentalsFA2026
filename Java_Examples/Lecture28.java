// CSC103 Lecture 28: Files and streams
// Teaching example for Dr. Muhammad Farhan
public class Lecture28 {
  public static void main(String[] args) throws Exception {
    java.io.File file = new java.io.File("marks.txt");
    System.out.println(file.getName());
    System.out.println(file.isAbsolute());
  }
  
}
