# CSC103 testing examples

Dr. Muhammad Farhan, Associate Professor of Computer Science, Department of Computer Science, COMSATS University Islamabad, Sahiwal Campus.

These examples accompany Lectures 30–32. Use JDK 17 or later and Maven. JUnit Jupiter 5.11.4 is a fixed teaching baseline.

From this directory, run:

```text
mvn test
```

The first run downloads Maven plugins and JUnit dependencies. `src/main/java` contains production code. `src/test/java` contains tests. `NumbersTest` checks calculations and boundaries. `MarksFileTest` checks UTF-8 file processing with isolated temporary files.

The contract accepts integer marks from 0 through 100. A mark of 50 passes. An empty file reads as an empty array, but computing its mean rejects the input. Malformed tokens and out-of-range marks reject the file. The example uses `ArrayList` as a small library extension to accommodate an unknown number of records, not as an additional required syllabus topic.

Exercise: change `mark >= 50` to `mark > 50`, run the tests, explain the failure, and restore the correct condition. Keep production and test code separate.

The expanded decks also include BoundaryTest (two boundary tests) and FileSummaryTest (one complete file integration test). Together the project has 26 test invocations, including parameterised cases.

## ISB exercise adaptations

IsbExercisesTest adds three parameterised digit-sum cases and a negative-input check. IsbRecordsTest adds five file integration checks. The project now has 35 passing test invocations. These tests adapt the supplied campus exercises; they were written for this edition.
