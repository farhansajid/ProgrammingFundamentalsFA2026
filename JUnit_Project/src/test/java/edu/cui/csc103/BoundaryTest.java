package edu.cui.csc103;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundaryTest {
  @Test
  void rejectsMarkAbove100() {
    assertThrows(IllegalArgumentException.class,
        () -> Numbers.validateMark(101));
  }

  @Test
  void acceptsMarkAt100() {
    assertDoesNotThrow(() -> Numbers.validateMark(100));
  }
}
