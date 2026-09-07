package edu.cui.csc103;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

class MarksFileTest {
    @TempDir Path temp;

    private Path fixture(String text) throws IOException {
        Path file = temp.resolve("marks.txt");
        Files.writeString(file, text, StandardCharsets.UTF_8);
        return file;
    }
    @Test void readsAndSummarisesNormalFile() throws IOException {
        int[] marks = MarksFile.read(fixture("40 50\n60 70\n"));
        assertArrayEquals(new int[]{40,50,60,70}, marks);
        assertEquals(55.0, Numbers.mean(marks), 1e-9);
        assertEquals(3, Numbers.passes(marks));
    }
    @Test void handlesOneMark() throws IOException {
        int[] marks = MarksFile.read(fixture("80"));
        assertEquals(80.0, Numbers.mean(marks), 1e-9);
        assertEquals(1, Numbers.passes(marks));
    }
    @Test void readsEmptyButRejectsItsMean() throws IOException {
        int[] marks = MarksFile.read(fixture(" \n"));
        assertEquals(0, marks.length);
        assertThrows(IllegalArgumentException.class, () -> Numbers.mean(marks));
    }
    @Test void rejectsMalformedTokenAndKeepsCause() throws IOException {
        Path file = fixture("50 bad 60");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
            () -> MarksFile.read(file));
        assertTrue(ex.getMessage().contains("bad"));
        assertInstanceOf(NumberFormatException.class, ex.getCause());
    }
    @Test void rejectsOutOfRangeMark() throws IOException {
        Path file = fixture("50 101");
        assertThrows(IllegalArgumentException.class, () -> MarksFile.read(file));
    }
    @Test void reportsMissingFile() {
        assertThrows(IOException.class, () -> MarksFile.read(temp.resolve("missing.txt")));
    }
}
