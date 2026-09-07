public class Solution10 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int sum = 0;
    int count = 0;
    int mark = in.nextInt();
    while (mark != -1) {
      sum += mark;
      count++;
      mark = in.nextInt();
    }
    if (count == 0) System.out.println("No data");
    else System.out.println((double) sum / count);
  }
}
