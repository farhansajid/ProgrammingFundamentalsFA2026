public class Solution18 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int count = in.nextInt();
    int sum = 0;
    int passes = 0;
    for (int i = 0; i < count; i++) {
      int mark = in.nextInt();
      sum += mark;
      if (isPass(mark)) passes++;
    }
    if (count == 0) System.out.println("No data");
    else {
      System.out.println((double) sum / count);
      System.out.println(passes);
    }
  }
  static boolean isPass(int mark) {
    return mark >= 50;
  }
}
