// CSC103 Lecture 8: Selection with if and else
// Teaching example for Dr. Muhammad Farhan
public class Lecture08 {
  public static void main(String[] args) throws Exception {
    int score = 80;
    String band;
    if (score >= 80) { band = "High"; }
    else if (score >= 50) { band = "Middle"; }
    else { band = "Low"; }
    System.out.println(band);
  }
  
}
