// CSC103 Lecture 27: Library components and APIs
// Teaching example for Dr. Muhammad Farhan
public class Lecture27 {
  public static void main(String[] args) throws Exception {
    int[] data = {8, 2, 5};
    int[] copy = java.util.Arrays.copyOf(data, data.length);
    java.util.Arrays.sort(copy);
    System.out.println(java.util.Arrays.toString(copy));
    System.out.println(java.util.Arrays.binarySearch(copy, 5));
    System.out.println(java.util.Arrays.toString(data));
  }
  
}
