public class Solution29 {
  public static void main(String[] args) throws Exception {
    String path = "expanded29-demo.txt";
    try (java.io.PrintWriter out = new java.io.PrintWriter(path, "UTF-8")) {
      out.println("60 80");
    }
    reportAverage(path);
  }
  static void reportAverage(String path) throws Exception {
    long sum = 0;
    int count = 0;
    try (java.util.Scanner in = new java.util.Scanner(
        new java.io.File(path), "UTF-8")) {
      while (in.hasNext()) {
        if (!in.hasNextInt()) {
          throw new IllegalArgumentException("Bad token: " + in.next());
        }
        int mark = in.nextInt();
        if (mark < 0 || mark > 100) {
          throw new IllegalArgumentException("Mark outside 0..100");
        }
        sum += mark;
        count++;
      }
      if (in.ioException() != null) throw in.ioException();
    }
    if (count == 0) System.out.println("No data");
    else System.out.println((double) sum / count);
  }
}
