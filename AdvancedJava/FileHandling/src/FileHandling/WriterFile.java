package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public static void main(String[] args) {
        try {
            doWrite();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doWrite() throws IOException {
        FileWriter writer = new FileWriter("/student.txt", true);

        writer.write("\nNames - Ben Dover");
        writer.write("\nCourse - Mass Communication");
        writer.write("\nMarks - 23");

        writer.close();
    }
}