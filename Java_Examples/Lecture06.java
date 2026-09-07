// CSC103 Lecture 6: Updates and formatted output
// Teaching example for Dr. Muhammad Farhan
public class Lecture06 {
  public static void main(String[] args) throws Exception {
    int count = 4;
    int before = count++;
    System.out.printf(java.util.Locale.US,
        "%d %d %.2f%n", before, count, 12.5);
  }
  
}
