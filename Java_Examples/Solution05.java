public class Solution05 {
  public static void main(String[] args) throws Exception {
    int totalSeconds = 3672;
    int hours = totalSeconds / 3600;
    int remainder = totalSeconds % 3600;
    int minutes = remainder / 60;
    int seconds = remainder % 60;
    System.out.println(hours + ":" + minutes + ":" + seconds);
  }
}
