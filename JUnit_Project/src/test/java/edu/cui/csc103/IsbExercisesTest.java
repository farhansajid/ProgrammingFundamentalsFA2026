package edu.cui.csc103;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
class IsbExercisesTest {
  @ParameterizedTest
  @CsvSource({"234,9", "0,0", "1001,2"})
  void digitSumMatchesContract(long input, int expected) {
    assertEquals(expected, IsbExercises.sumDigits(input));
  }
  @Test void negativeInputIsRejected() {
    assertThrows(IllegalArgumentException.class, () -> IsbExercises.sumDigits(-1));
  }
}
