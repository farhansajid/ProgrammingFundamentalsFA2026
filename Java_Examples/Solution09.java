public class Solution09 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner in = new java.util.Scanner(System.in);
    int choice = in.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Add");
        break;
      case 2:
        System.out.println("Remove");
        break;
      default:
        System.out.println("Invalid");
    }
  }
}
