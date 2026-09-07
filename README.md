# CSC103 Programming Fundamentals

Dr. Muhammad Farhan  
Associate Professor of Computer Science  
Department of Computer Science  
COMSATS University Islamabad, Sahiwal Campus

32 colorful Beamer presentations, 1,055 slides, 32 vector diagrams and 128 tables.

## Present and edit

- Lecture Presentation PDFs/ contains the ready-to-present PDFs.
- Java_Examples/ retains the original 64 demonstrations and exercise solutions.
- JUnit_Project/ contains the original and new discoverable tests.

The decks contain more material than should necessarily be presented in one sitting. Use the added worked example instead of an earlier overlapping example, or assign it as follow-up practice to retain a 90-minute lecture. Course_Plan.md preserves syllabus mapping and gives current slide counts.


## Run the new Java examples

Use JDK 17 or later. From Java_Examples/:

```text
javac --release 17 IsbLecture15.java
java IsbLecture15
```

IsbLecture04 reads `20`; IsbLecture10 reads `10 80 42`; IsbLecture12 reads `Islamabad` and `Sahiwal` on separate lines. Other inputs are fixed in the examples. IsbLecture28, 29 and 32 create temporary demonstration files. IsbLecture31 and 32 require JUnit Jupiter on the classpath; run the corresponding discoverable tests using `mvn test` from JUnit_Project/. Its first Maven run may need to download dependencies.

The 32 new programs compiled for Java 17 and matched their expected outputs. The full companion JUnit project passed 35 test invocations. The PDFs were compiled, page counts checked, and new slide layouts rendered for review.
