public class Solution07 {
  public static void main(String[] args) throws Exception {
    int age = 11;
    System.out.println(age < 12 || age >= 60);
    age = 12;
    System.out.println(age < 12 || age >= 60);
    age = 59;
    System.out.println(age < 12 || age >= 60);
    age = 60;
    System.out.println(age < 12 || age >= 60);
  }
}
