package edu.cui.csc103;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test void largerOfTwoNegatives() {
        assertEquals(-2, Numbers.max(-4, -2));
    }

    @ParameterizedTest
    @CsvSource({"2,5,5", "-4,-2,-2", "3,3,3", "9,1,9"})
    void maximumCases(int a, int b, int expected) {
        assertEquals(expected, Numbers.max(a, b));
    }

    @Test void rejectsMarkAbove100() {
        assertThrows(IllegalArgumentException.class, () -> Numbers.validateMark(101));
    }
    @Test void acceptsMarkAt100() {
        assertDoesNotThrow(() -> Numbers.validateMark(100));
    }
    @Test void rejectsNegativeMark() {
        assertThrows(IllegalArgumentException.class, () -> Numbers.validateMark(-1));
    }
    @Test void meanRetainsFraction() {
        assertEquals(70.5, Numbers.mean(new int[]{60, 81}), 1e-9);
    }
    @Test void rejectsEmptyMean() {
        assertThrows(IllegalArgumentException.class, () -> Numbers.mean(new int[]{}));
    }
    @Test void rejectsNullMean() {
        assertThrows(IllegalArgumentException.class, () -> Numbers.mean(null));
    }
    @ParameterizedTest
    @CsvSource({"49,0", "50,1", "51,1"})
    void passBoundary(int mark, int expected) {
        assertEquals(expected, Numbers.passes(new int[]{mark}));
    }
    @Test void emptyPassCountIsZero() {
        assertEquals(0, Numbers.passes(new int[]{}));
    }
    @Test void doublingLeavesInputUnchanged() {
        int[] original = {2, 3};
        int[] result = Numbers.doubled(original);
        assertArrayEquals(new int[]{4, 6}, result);
        assertArrayEquals(new int[]{2, 3}, original);
        assertNotSame(original, result);
    }
    @Test void doublingRejectsOverflow() {
        assertThrows(ArithmeticException.class, () -> Numbers.doubled(new int[]{Integer.MAX_VALUE}));
    }
}
