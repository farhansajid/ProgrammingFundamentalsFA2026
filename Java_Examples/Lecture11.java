// CSC103 Lecture 11: For and do-while loops
// Teaching example for Dr. Muhammad Farhan
public class Lecture11 {
  public static void main(String[] args) throws Exception {
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      if (i == 3) continue;
      sum += i;
    }
    System.out.println(sum);
  }
  
}
