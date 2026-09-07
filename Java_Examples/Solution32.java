public class Solution32 {
  public static void main(String[] args) throws Exception {
    int[] marks = {40, 50, 60, 70};
    System.out.println(mean(marks));
    System.out.println(passes(marks));
    System.out.println(passes(new int[]{50}));
  }
  static double mean(int[] marks) {
    if (marks.length == 0) throw new IllegalArgumentException("empty");
    long sum = 0;
    for (int mark : marks) {
      if (mark < 0 || mark > 100) throw new IllegalArgumentException("range");
      sum += mark;
    }
    return (double) sum / marks.length;
  }
  static int passes(int[] marks) {
    int count = 0;
    for (int mark : marks) if (mark >= 50) count++;
    return count;
  }
}
