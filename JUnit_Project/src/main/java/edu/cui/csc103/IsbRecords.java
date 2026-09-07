package edu.cui.csc103;
public class IsbRecords {
public static int[] readScores(java.nio.file.Path file) throws java.io.IOException {
  java.util.List<String> lines = java.nio.file.Files.readAllLines(
    file, java.nio.charset.StandardCharsets.UTF_8);
  int[] scores = new int[lines.size()];
  for (int i = 0; i < lines.size(); i++) {
    String[] fields = lines.get(i).trim().split("\\s+");
    if (fields.length != 4) throw new IllegalArgumentException("four fields required");
    int score = Integer.parseInt(fields[3]);
    if (score < 0 || score > 100) throw new IllegalArgumentException("score range");
    scores[i] = score;
  }
  return scores;
}
}
