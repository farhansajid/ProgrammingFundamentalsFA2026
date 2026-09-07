package edu.cui.csc103;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** UTF-8 whitespace-separated marks. Malformed or out-of-range data rejects the file. */
public final class MarksFile {
    private MarksFile() { }

    public static int[] read(Path path) throws IOException {
        // A growing List is an extension used only in this integration example.
        List<Integer> values = new ArrayList<>();
        try (Scanner in = new Scanner(path, StandardCharsets.UTF_8)) {
            while (in.hasNext()) {
                String token = in.next();
                final int mark;
                try {
                    mark = Integer.parseInt(token);
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException("Invalid mark token: " + token, ex);
                }
                Numbers.validateMark(mark);
                values.add(mark);
            }
            if (in.ioException() != null) throw in.ioException();
        }
        int[] result = new int[values.size()];
        for (int i = 0; i < result.length; i++) result[i] = values.get(i);
        return result;
    }
}
