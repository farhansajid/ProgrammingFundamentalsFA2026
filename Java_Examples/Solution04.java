public class Solution04 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner in = new java.util.Scanner(System.in);
    in.useLocale(java.util.Locale.US);
    int quantity = in.nextInt();
    double price = in.nextDouble();
    char category = in.next().charAt(0);
    double total = quantity * price;
    System.out.println(total);
    System.out.println(category);
  }
}
