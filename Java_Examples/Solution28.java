public class Solution28 {
  public static void main(String[] args) throws Exception {
    java.io.File file = new java.io.File("data/marks.txt");
    System.out.println(file.getAbsolutePath());
    System.out.println(file.exists());
    System.out.println(file.isFile());
  }
}
