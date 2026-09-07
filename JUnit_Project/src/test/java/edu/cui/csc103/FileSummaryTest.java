package edu.cui.csc103;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

class FileSummaryTest {
  @TempDir Path folder;

  @Test
  void summarisesAControlledFile() throws Exception {
    Path file = folder.resolve("marks.txt");
    Files.writeString(file, "40 50 60 70", StandardCharsets.UTF_8);
    int[] marks = MarksFile.read(file);
    assertArrayEquals(new int[]{40,50,60,70}, marks);
    assertEquals(55.0, Numbers.mean(marks), 1e-9);
    assertEquals(3, Numbers.passes(marks));
  }
}
