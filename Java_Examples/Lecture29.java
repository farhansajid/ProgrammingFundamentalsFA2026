// CSC103 Lecture 29: Reading and writing text files
// Teaching example for Dr. Muhammad Farhan
public class Lecture29 {
  public static void main(String[] args) throws Exception {
    String path = "lecture29-demo.txt";
    try (java.io.PrintWriter out = new java.io.PrintWriter(path, "UTF-8")) {
      out.println(60); out.println(80);
    }
    int sum = 0;
    try (java.util.Scanner in = new java.util.Scanner(new java.io.File(path), "UTF-8")) {
      while (in.hasNextInt()) sum += in.nextInt();
    }
    System.out.println(sum);
  }
  
}
