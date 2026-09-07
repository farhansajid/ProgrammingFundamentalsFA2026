package edu.cui.csc103;

/** Pure calculations used in CSC103 Lectures 30-32. */
public final class Numbers {
    private Numbers() { }

    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static void validateMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("mark outside 0..100: " + mark);
        }
    }

    public static double mean(int[] marks) {
        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("mean requires nonempty marks");
        }
        long total = 0;
        for (int mark : marks) {
            validateMark(mark);
            total += mark;
        }
        return (double) total / marks.length;
    }

    public static int passes(int[] marks) {
        if (marks == null) throw new IllegalArgumentException("marks must not be null");
        int count = 0;
        for (int mark : marks) {
            validateMark(mark);
            if (mark >= 50) count++;
        }
        return count;
    }

    public static int[] doubled(int[] values) {
        if (values == null) throw new IllegalArgumentException("values must not be null");
        int[] copy = new int[values.length];
        for (int i = 0; i < values.length; i++) copy[i] = Math.multiplyExact(values[i], 2);
        return copy;
    }
}
