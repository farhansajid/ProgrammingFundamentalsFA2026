// CSC103 Lecture 9: Short-circuiting and switch
// Teaching example for Dr. Muhammad Farhan
public class Lecture09 {
  public static void main(String[] args) throws Exception {
    int choice = 2;
    String label;
    switch (choice) {
      case 1: label = "Open"; break;
      case 2: label = "Save"; break;
      default: label = "Unknown";
    }
    System.out.println(label);
  }
  
}
