package edu.cui.csc103;
public class IsbExercises {
public static int sumDigits(long n) {
  if (n < 0) throw new IllegalArgumentException("nonnegative required");
  int sum = 0;
  while (n != 0) {
    sum += n % 10;
    n /= 10;
  }
  return sum;
}
}
