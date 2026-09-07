public class Solution13 {
  public static void main(String[] args) throws Exception {
    String email = "ali@campus.edu";
    int at = email.indexOf("@");
    if (at <= 0 || at == email.length() - 1) {
      System.out.println("Invalid format");
    } else {
      String user = email.substring(0, at);
      String domain = email.substring(at + 1);
      System.out.println(user);
      System.out.println(domain);
    }
  }
}
