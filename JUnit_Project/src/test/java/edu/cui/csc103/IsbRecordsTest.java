package edu.cui.csc103;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;
class IsbRecordsTest {
  @TempDir Path folder;
  Path fixture(String text) throws Exception {
    Path file = folder.resolve("records.txt");
    Files.writeString(file, text, StandardCharsets.UTF_8);
    return file;
  }
  @Test void sourceRecordsParseAndSummarise() throws Exception {
    int[] scores = IsbRecords.readScores(fixture("John T Smith 90\nEric K Jones 85\n"));
    assertArrayEquals(new int[]{90,85}, scores);
    assertEquals(87.5, (scores[0] + scores[1]) / 2.0, 1e-9);
  }
  @Test void nonIntegerScoreIsRejected() throws Exception {
    Path file = fixture("John T Smith bad\n");
    assertThrows(NumberFormatException.class, () -> IsbRecords.readScores(file));
  }
  @Test void outOfRangeScoreIsRejected() throws Exception {
    Path file = fixture("John T Smith 101\n");
    assertThrows(IllegalArgumentException.class, () -> IsbRecords.readScores(file));
  }
  @Test void missingFieldIsRejected() throws Exception {
    Path file = fixture("John Smith 90\n");
    assertThrows(IllegalArgumentException.class, () -> IsbRecords.readScores(file));
  }
  @Test void emptyFileHasNoScores() throws Exception {
    assertArrayEquals(new int[0], IsbRecords.readScores(fixture("")));
  }
}
