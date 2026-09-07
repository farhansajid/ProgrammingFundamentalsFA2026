// CSC103 Lecture 18: Midterm practice workshop
// Teaching example for Dr. Muhammad Farhan
public class Lecture18 {
  public static void main(String[] args) throws Exception {
    int sum = 0, passes = 0;
    for (int mark = 40; mark <= 70; mark += 10) {
      sum += mark;
      if (mark >= 50) passes++;
    }
    System.out.println(sum / 4.0);
    System.out.println(passes);
  }
  
}
