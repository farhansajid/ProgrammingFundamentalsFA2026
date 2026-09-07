// CSC103 Lecture 32: Testing practice and course synthesis
// Teaching example for Dr. Muhammad Farhan
public class Lecture32 {
  public static void main(String[] args) throws Exception {
    int[] marks = {40, 50, 60, 70};
    int sum = 0, passes = 0;
    for (int mark : marks) {
      sum += mark;
      if (mark >= 50) passes++;
    }
    System.out.println((double) sum / marks.length);
    System.out.println(passes);
  }
  
}
